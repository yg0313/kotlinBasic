fun main(args: Array<String>) {
    var a = 10;
    var b = 20;

    var c = if (a != b) {
        println("a와 b의 값이 다르다.")
        a + b
    } else {
        println("a와 b의 값이 같다.")
        1020
    }

    println(c) // 30
}