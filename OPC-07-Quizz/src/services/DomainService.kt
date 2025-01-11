package services

import models.Domain
import services.QuestionService

class DomainService {
    private val availableDomains = listOf("Informatique", "Chimie", "Physique", "Géographie", "Histoire")

    fun selectDomain(): Domain {
        println("\n🌍 Sélectionnez un domaine pour votre quiz :")
        availableDomains.forEachIndexed { index, domain ->
            println("\t${index + 1}️⃣  $domain")
        }

        var choice: Int?
        do {
            print("\t👉 Entrez le numéro du domaine choisi : ")
            choice = readln().toIntOrNull()
            if (choice == null || choice !in 1..availableDomains.size) {
                println("\t❌ Choix invalide, veuillez réessayer !")
            }
        } while (choice == null || choice !in 1..availableDomains.size)

        val selectedDomain = availableDomains[choice - 1]
        val questions = QuestionService().getQuestionsForDomain(selectedDomain)
        println("\n\t✅ Vous avez sélectionné : $selectedDomain ! Préparez-vous à jouer ! 🎮\n")
        return Domain(selectedDomain, questions)
    }
}