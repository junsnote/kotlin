package chap04.section1

fun main() {
    val result: Int

    // val multi = {a: Int, b: Int -> a * b}
    val multi: (a: Int, b: Int) -> Int = {a, b ->
        println("a: $a, b: $b")
        a * b

    }

    // 람다식 안에 람다식
    val nestedLambda: () -> () -> Unit = {
        {
            println("nestedLambda")
        }
    }

    result = multi(10, 20)
    nestedLambda()
    println(result)
}