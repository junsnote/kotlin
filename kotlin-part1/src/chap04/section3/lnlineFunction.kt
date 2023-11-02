package chap04.section3

inline fun shotrFunc(a: Int, crossinline out: (Int) -> Unit){   // crossinline 비지역 반환을 금함
    println("Hello")
    out(a)
    println("Goodbye")  // 비지역 반환으로 실행되지 않음
}


fun main() {
    shotrFunc(3) {
        println("a: $it")
        // return
    }
}