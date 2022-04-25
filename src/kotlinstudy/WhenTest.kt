fun main(args: Array<String>){
    var num:Int = 10

    when(num){
        0 -> println("숫자는 0")
        5 -> println("숫자는 5")
        10 -> println("숫자는 10")
        else -> {
            println("숫자는 0,5,10도 아닌 다른 수")
            println("{}도 활용가능")
        }
    }

    var arr:IntArray = intArrayOf(1,2,3,4,10)
    when(num){
        0,1 -> println("숫자는 0과 1")
        in 2..5 -> println("2와 5사이의 수")
        in arr -> println("arr 배열에 속함")
        !in arr -> println("arr 배열에 속하지 않음")
    }

    var unknownObject:Any = "ABCDEFG"
    when(unknownObject){
        is TestClass -> println(unknownObject.print())
        is String -> println(unknownObject.length)
        is Int -> println(unknownObject.minus(10))
    }

    val digitStr = digit(num)
    println(digitStr)
}

// when을 통해 값을 return
fun digit(num: Int) = when(num) {
    in 0..9 -> "한자리 수"
    in 10..99 -> "두자리 수"
    in 100..999 -> "세자리 수"
    else -> "out of Range"
}

class TestClass{
    fun print(){
        println("TestClass 실행 print() 실행")
    }
}

