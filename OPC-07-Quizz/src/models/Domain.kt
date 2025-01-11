package models

data class Domain(
    val title: String,
    val questions: List<Question>,
    var score: Int = 0,
    var status: String = "En cours"
)