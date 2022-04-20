# kotlinBasic
 
# 변수

var 키워드 사용
```
var num = 10 // 컴파일러가 자동으로 타입 유추하여 int 자료형 부여
var num:INT = 10 // 명시적으로 변수형 선언하여 사용 가능
```
변수의 자료형을 명시해 줬을때에는 정의 후, 나중에 초기화 가능
```
var num:Int
num = 10
```

상수 선언 val
```
val num:Int
num 10
```

# 자료형
코틀린의 자료형은 자바와 동일  
코틀린의 자료형은 기본적으로 레퍼런스 자료형이지만 기본적으로 NULL을 가질 수 없다.  
NULL 값을 갖게 하기위해서는 자료형 이름 뒤에 ?를 붙여줘야 한다.
```
val str:String = null // 컴파일 에러
val str:String? = null // ?를 붙여줘서 NULL 대입
```

# 배열
코틀린에서 배열은 Array클래스에 제네릭타입을 넣어 표현
```
// 빈 배열 객체 생성
var emptyArr = emptyArray<Int>()

// 기본값이 들어있는 배열 생성
var arr:Array<Int> = arrayOf(1,2,3)

// 배열의 사이즈를 정하고 값들을 null로 초기화
var nullArr = arrayOfNulls<Int>(5)
println(nullArr.size) //5
```

# 조건문

## if문  
코틀린의 if문은 자바와 동일
대신 코틀린은 삼항연산자가 없기 때문에 if문을 삼항연산자처럼 값을 할당하는데에 사용할 수 있다.
```
fun main(args: Array<String>) {
    var a = 10;
    var b = 20;

    var c = if (a != b) {
        println("a와 b의 값이 다르다.")
        a + b // c = a+b
    } else {
        println("a와 b의 값이 같다.")
        1020 // c = 1020
    }

    println(c) // 30
}
```

## When
자바의 switch-case와 유사
콜론(:) 대신 ->를 사용 또한 default 대신 else 사용
```
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
}

결과 : 숫자는 10
```
여러 값 비교, 범위 또는 배열에 속하는지도 when에서 사용가능
```
fun main(args: Array<String>){
    var num:Int = 10
    var arr:IntArray = intArrayOf(1,2,3,4,10)
    
    when(num){
        0,1 -> println("숫자는 0과 1")
        in 2..5 -> println("2와 5사이의 수")
        in arr -> println("arr 배열에 속함")
        !in arr -> println("arr 배열에 속하지 않음")
    }
}

결과 : arr 배열에 속함
```
인자의 타입을 모르는 경우에, 코틀린의 when 문법에서는 타입 검사에 자동 형변환도 지원해준다.
```
fun main(args: Array<String>){0
    var unknownObject:Any = "ABCDEFG"
    
    when(unknownObject){
        is TestClass -> println(unknownObject.print())
        is String -> println(unknownObject.length)
        is Int -> println(unknownObject.minus(10))
    }
}
class TestClass{
    fun print(){
        println("TestClass 실행 print() 실행")
    }
}

결과 : 7
```
when은 그 자체로도 함수가 될 수 있다.
```
fun main(args: Array<String>){
    val num:Int = 50
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

결과 : 두자리 수
```
