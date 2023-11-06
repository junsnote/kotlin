package chap05.section2

fun main() {
    var total = 0

    for (num in 0..99 step 2) {  // 홀수의 합
        total += num

    }
    println("total: $total")
}