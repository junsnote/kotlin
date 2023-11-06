package chap05.section3

fun main() {
    retFunc1()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out (a, b)
}

fun retFunc1(){
    println("start of retFunc")
    inlineLambda(3, 3){ a, b ->
        val result = a + b
        if(result > 10) return  // 10보다 크면 이 함수를 빠져 나감
        println("result: $result")  // 10보다 크면 이 문장에 도달하지 못함
    }
    println("end of retFunc")
}