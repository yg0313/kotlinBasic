fun main(args : Array<String>){
//    voidAdd(1,2)
//    println(returnAdd(1,2))
//    println(defaultNum(1))

    varNum(1,2,3,4)
}

fun voidAdd(a:Int, b:Int){ // 반환값이 없음
    println(a+b)
}

fun returnAdd(a:Int, b:Int) : Int{ // 반환값이 있음
    return a+b
}

fun defaultNum(a:Int, b:Int=2) : Int{   // 인자에 디폴트값 부여
    return a+b
}

fun varNum(vararg num:Int){ // 가변인자 활용
    for (number in num){
        print(number)
    }
}