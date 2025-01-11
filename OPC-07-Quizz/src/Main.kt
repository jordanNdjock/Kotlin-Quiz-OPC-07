import services.QuizService
import services.UserService
import services.DomainService

fun main() {
    val userService = UserService()
    val user = userService.registerUser()
    val domainService = DomainService()
    val selectedDomain = domainService.selectDomain()
    val quizService = QuizService()
    quizService.startQuiz(user, selectedDomain)
}