package chap05.section1

fun main() {
    print("Enter the Score: ")
    val score  = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0){
        grade = 'A'
    }else if (score >= 80 && score <= 89.9){
        grade = 'B'
    }else if (score in 80.0..89.9){
        grade = 'C'
    }

    println("score: $score, grade: $grade")
}