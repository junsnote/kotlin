package chap04.section4

fun main() {
    val num = 5
    factorial(num, 4)
    println("Factorial: $num -> ${factorial(num)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long{
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}