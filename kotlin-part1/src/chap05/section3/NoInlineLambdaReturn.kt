package chap05.section3

fun main() {
    retFunc2()
}

fun inlinLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
}

fun retFunc2(){
    println("start of retFunc")
    inlinLambda(13, 3) lit@{a, b->
        val result = a + b
        if(result > 10) return@lit
        println("result: $result")
    }
    println("end of retFunc")

}