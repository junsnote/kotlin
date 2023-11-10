package chap05.section5

fun main(){
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "success"
    }
    println(person)
    println("a: $a")

    val b = person.also{
        it.skills = "java"
        // "success"
    }
    println(person)
    println("b: $b")
}