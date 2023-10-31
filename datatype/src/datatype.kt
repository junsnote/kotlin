fun main() {
    // val은 불변형 변수 키워드로 username은 불변형이다.

    // 선언 키워드 변수명[:자료형] = "값"
    // val username: String = "Kildong"

    var username = "Kildong"
    val username2: String
    username2 = "Test"
    var count = 3
    username = "Dooly"

    println("username: $username, count: $count")
}