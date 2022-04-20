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
