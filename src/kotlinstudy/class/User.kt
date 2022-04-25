package kotlinstudy.`class`

class User(
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0
) {
    init {  // 생성자 초기화와 동시에 실행
        println("init $name, $email, $age")
    }

    fun getInfo() {
        println("$name, $email, $age")
    }
}