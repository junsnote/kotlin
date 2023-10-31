package chap03.section1

fun avgFunc(initial: Float=0f, vararg numbers: Float):Double{
    var result = 0f
    for (num in numbers){
        result += num
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = (result / numbers.size).toDouble() + initial
    return avg
}


fun main() {
    // 첫 번째 인자: 초기값, 이후 인자는 가변 인자
    val result = avgFunc(5f, 100f, 80f)
    println("avg result: $result")
}