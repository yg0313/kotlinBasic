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
