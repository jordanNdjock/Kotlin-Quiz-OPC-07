package services

import models.Domain
import models.User
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.thread
import kotlin.system.exitProcess

class QuizService {
    fun startQuiz(user: User, domain: Domain) {
        println("\n\t🎯 Quiz sur le domaine : ${domain.title}")
        var score = 0

        domain.questions.forEachIndexed { index, question ->
            println("\n\t❓ Question ${index + 1}: ${question.title}")
            question.choices.forEachIndexed { i, option -> println("\t${i + 1}️⃣  $option") }

            var userResponse: Int? = null
            var timeUp = false
            val timer = Timer()

            val countdownThread = Thread {
                try {
                    for (i in question.time downTo 1) {
                        print("\r\t⏳ Temps restant : $i secondes   ")
                        Thread.sleep(1000)
                        if (timeUp) break
                    }
                } catch (e: InterruptedException) {
                    //
                }
            }
            countdownThread.start()

            val task = timer.schedule(question.time * 1000L) {
                timeUp = true
                println("\n\t⏳ Temps écoulé ! ❌ Réponse incorrecte.")
            }

            while (!timeUp) {
                print("\n\t👉 Votre réponse (1-4) : ")
                val input = readlnOrNull()?.toIntOrNull()
                if (input != null && input in 1..4) {
                    userResponse = input
                    break
                } else {
                    println("\t⚠️ Veuillez entrer un nombre entre 1 et 4.")
                }
            }

            countdownThread.interrupt()
            task.cancel()

            if (timeUp) {
                println("\t❌ Mauvaise réponse. Vous avez dépassé le temps.")
            } else if (userResponse != null && userResponse - 1 == question.correctResponse) {
                println("\t✅ Bonne réponse ! 🎉")
                score += question.points
            } else {
                println("\t❌ Mauvaise réponse.")
            }
        }

        domain.score = score
        domain.status = if (score > 5) "🏆 Réussi !" else "❌ Échoué !"

        println("\n\t📊 Score final de ${user.name} : ${domain.score}/10 - Statut : ${domain.status}")

        if (score == 5) {
            print("\t🔄 Vous avez obtenu 5/10. Voulez-vous recommencer ? (Oui/Non) : ")
            if (readln().lowercase() == "oui") {
                startQuiz(user, domain)
                return
            }
        }

        print("\t🔄 Voulez-vous essayer un autre domaine ? (Oui/Non) : ")
        if (readln().lowercase() == "oui") {
            val newDomain = DomainService().selectDomain()
            startQuiz(user, newDomain)
        } else {
            println("\t👋 Merci d'avoir joué ! À bientôt ! 🎉")
            exitProcess(0)
        }
    }
}