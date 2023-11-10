package chap05.section5

fun main() {
    val score: Int? = 32
    fun checkScore(){
        if(score != null){
            println("Score: $score")
        }
    }

    fun checkScoreLet() {
        score?.let {println("Score: $score")}
        val str = score.let {it.toString()}
        println(str)
    }

    checkScore()
    checkScoreLet()
}