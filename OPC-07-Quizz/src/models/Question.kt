package models

data class Question(
    val title: String,
    val choices: List<String>,
    val correctResponse: Int,
    val time: Int = 10,
    val points: Int = 1
)