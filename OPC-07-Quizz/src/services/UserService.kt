package services

import models.User

class UserService {
    private val users = mutableListOf<User>()

    fun registerUser(): User {
        println("\n\t=============================== 🎉 Bienvenue dans le LJ Quiz Challenge ! 🎉 =============================== \n")
        var name: String
        do {
            print("\t📝 Entrez votre nom : ")
            name = readln().trim()
        } while (name.isEmpty())

        val user = User(name)
        users.add(user)
        println("\t✅ Utilisateur ${name.capitalize()} enregistré avec succès !\n")
        return user
    }
}