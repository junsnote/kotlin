package chap03.section1

// 가변 인자를 가진 함수 정의
fun normalVarargs(vararg a: Int){
    for(num in a){
        print("$num")
    }
}


fun main() {
    normalVarargs(1)    // 1
    println()
    normalVarargs(1,2,3,4)  // 1, 2, 3, 4
}