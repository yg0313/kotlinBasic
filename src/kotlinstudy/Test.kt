fun main(args: Array<String>) { // 메인함수
    var num = 10;
    println(num)
    println(helloWorld())
    println(add(1,2))
    var emptyArr = emptyArray<Int>()
    println(emptyArr.toString())

    var nullArr = arrayOfNulls<Int>(5)
    println(nullArr.size)
}

fun helloWorld() : Unit{ // return 타입이 없으면 Unit으로 설정 (생략가능)
    println("helloWorld")
}

fun add(a:Int, b:Int) : Int{
    println("덧셈")
    return a+b
}