package services

import models.Question

class QuestionService {
    fun getQuestionsForDomain(domain: String): List<Question> {
        return when (domain) {
            "Informatique" -> listOf(
                Question("Combien de langages de programmation sont considérés comme des langages de haut niveau ?", listOf("3", "5", "7", "9"), 1),
                Question("Qui est souvent considéré comme le père de l'informatique ?", listOf("Alan Turing", "Steve Jobs", "Bill Gates", "Tim Berners-Lee"), 0),
                Question("Quel est le composant essentiel pour stocker des données de façon permanente dans un ordinateur ?", listOf("Carte graphique", "Disque dur", "RAM", "CPU"), 1),
                Question("Quel protocole est utilisé pour transférer des fichiers sur Internet ?", listOf("TCP", "HTTP", "FTP", "HTTPS"), 2),
                Question("Quelle est la méthode la plus courante pour organiser et stocker des données de manière structurée dans une base de données relationnelle ?", listOf("XML", "HTML", "JSON", "SQL"), 3),
                Question("Qui est l'inventeur du langage de programmation Python ?", listOf("Mark Zuckerberg", "Larry Page", "Linus Torvalds", "Guido van Rossum"), 3),
                Question("Quel est le terme pour désigner une série d'instructions exécutées par un ordinateur pour effectuer une tâche spécifique ?", listOf("Programme", "Code source", "Algorithme", "Script"), 2),
                Question("Quel est le composant matériel qui exécute les instructions d'un programme et effectue les opérations de calcul dans un ordinateur ?", listOf("GPU", "Disque dur", "RAM", "CPU"), 3),
                Question("Quel type de système d'exploitation est basé sur le noyau Linux ?", listOf("Android", "Unix", "macOS", "Windows"), 0),
                Question("Quel est le principal langage de programmation utilisé pour créer des pages Web dynamiques ?", listOf("JavaScript", "PHP", "C++", "Java"), 0)
            )
            "Chimie" -> listOf(
                Question("Quel est le symbole chimique de l'eau ?", listOf("H2O", "CO2", "O2", "NaCl"), 0),
                Question("Quel gaz est responsable de l'effet de serre ?", listOf("Azote", "Dioxyde de carbone", "Oxygène", "Hydrogène"), 1),
                Question("Quel est le pH de l'eau pure ?", listOf("7", "5", "9", "12"), 0),
                Question("Quel est le métal liquide à température ambiante ?", listOf("Mercure", "Fer", "Plomb", "Aluminium"), 0),
                Question("Que mesure l'échelle de Mohs ?", listOf("Dureté des minéraux", "pH", "Toxicité", "Température de fusion"), 0),
                Question("Quel est le symbole chimique du sel de table ?", listOf("NaCl", "H2O", "CO2", "O2"), 0),
                Question("Quel est le gaz le plus abondant dans l'atmosphère terrestre ?", listOf("Oxygène", "Azote", "Carbone", "Hydrogène"), 1),
                Question("Quelle est la formule chimique du dioxyde de carbone ?", listOf("CO2", "O2", "CH4", "NaCl"), 0),
                Question("Quel élément chimique a pour symbole Fe ?", listOf("Fer", "Fluor", "Francium", "Fermium"), 0),
                Question("Quel est le pH neutre d'une solution aqueuse ?", listOf("7", "0", "14", "5"), 0)
            )
            "Physique" -> listOf(
                Question("Quelle est la vitesse de la lumière ?", listOf("299 792 km/s", "150 000 km/s", "3 000 km/s", "30 000 km/s"), 0),
                Question("Quelle est l'unité de mesure de la force ?", listOf("Newton", "Joule", "Watt", "Pascal"), 0),
                Question("Quelle est la loi de Newton qui explique l'inertie ?", listOf("1ère loi", "2ème loi", "3ème loi", "4ème loi"), 0),
                Question("Quelle est la principale force responsable du mouvement des planètes ?", listOf("Gravité", "Magnétisme", "Force nucléaire", "Électricité"), 0),
                Question("Quelle unité est utilisée pour mesurer l'énergie ?", listOf("Joule", "Newton", "Pascal", "Volt"), 0),
                Question("Quel phénomène explique pourquoi les objets flottent ou coulent dans l'eau ?", listOf("Gravité", "Poussée d'Archimède", "Magnétisme", "Pression atmosphérique"), 1),
                Question("Quelle est la charge électrique d'un neutron ?", listOf("Positive", "Négative", "Neutre", "Variable"), 2),
                Question("Quel scientifique a formulé la théorie de la relativité ?", listOf("Isaac Newton", "Galilée", "Albert Einstein", "Marie Curie"), 2),
                Question("Quelle est l’unité de mesure de la pression ?", listOf("Pascal", "Bar", "Newton", "Joule"), 0),
                Question("Comment appelle-t-on la résistance d’un matériau à un courant électrique ?", listOf("Conductivité", "Résistance", "Impedance", "Inductance"), 1)
            )
            "Géographie" -> listOf(
                Question("Quel est le plus grand océan du monde ?", listOf("Atlantique", "Indien", "Arctique", "Pacifique"), 3),
                Question("Quelle est la capitale du Canada ?", listOf("Toronto", "Ottawa", "Vancouver", "Montréal"), 1),
                Question("Quel est le plus grand désert du monde ?", listOf("Sahara", "Antarctique", "Gobi", "Kalahari"), 1),
                Question("Dans quel pays se trouve la forêt amazonienne ?", listOf("Brésil", "Argentine", "Pérou", "Colombie"), 0),
                Question("Quel est le plus long fleuve du monde ?", listOf("Nil", "Amazone", "Yang-Tsé-Kiang", "Mississippi"), 1),
                Question("Quel est le plus haut sommet d'Afrique ?", listOf("Kilimandjaro", "Mont Kenya", "Atlas", "Drakensberg"), 0),
                Question("Quelle est la capitale du Cameroun ?", listOf("Yabassi", "Limbé", "Youndé", "Maroua"), 2),
                Question("Quel est le plus grand lac d'Afrique ?", listOf("Lac Tchad", "Lac Tanganyika", "Lac Victoria", "Lac Malawi"), 2),
                Question("Quel est le fleuve qui traverse l'Égypte ?", listOf("Congo", "Zambèze", "Nil", "Niger"), 2),
                Question("Quel désert est situé en Afrique australe ?", listOf("Sahara", "Kalahari", "Gobi", "Namib"), 1)
            )
            "Histoire" -> listOf(
                Question("Qui était Napoléon Bonaparte ?", listOf("Un empereur français", "Un président américain", "Un roi d'Angleterre", "Un explorateur italien"), 0),
                Question("Qui est le premier président du Cameroun ?", listOf("Ahmadou Ahidjo", "Paul Biya", "Ruben Um Nyobe", "John Ngu Foncha"), 0),
                Question("Quelle année marque l'indépendance du Cameroun ?", listOf("1958", "1960", "1961", "1972"), 1),
                Question("Qui est connu comme le père de l'indépendance congolaise ?", listOf("Patrice Lumumba", "Mobutu Sese Seko", "Joseph Kabila", "Thomas Sankara"), 0),
                Question("Quel pays africain n’a jamais été colonisé ?", listOf("Égypte", "Afrique du Sud", "Éthiopie", "Kenya"), 2),
                Question("Quel roi africain a résisté aux invasions coloniales françaises en Afrique de l'Ouest ?", listOf("Samory Touré", "Shaka Zulu", "Osei Tutu", "Haile Selassie"), 0),
                Question("En quelle année Nelson Mandela est-il devenu président de l'Afrique du Sud ?", listOf("1989", "1994", "1999", "2004"), 1),
                Question("Quel grand empire africain était situé dans l'actuel Mali ?", listOf("Empire du Ghana", "Empire du Mali", "Empire Songhaï", "Empire du Bénin"), 1),
                Question("Quel pays a été la première colonie française en Afrique ?", listOf("Algérie", "Sénégal", "Côte d'Ivoire", "Gabon"), 1),
                Question("Qui a fondé la ville de Tombouctou ?", listOf("Sonni Ali", "Mansa Moussa", "Berbères", "Ousmane Dan Fodio"), 2)
            )
            else -> emptyList()
        }
    }
}