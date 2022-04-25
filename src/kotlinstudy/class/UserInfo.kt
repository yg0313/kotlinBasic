package kotlinstudy.`class`

fun main(args :Array<String>){

    var user = User()
    user.getInfo()

    var user2 = User(
        name="kyg",
        email="abcd",
        age = 31
    )
    user2.getInfo()

    var user3 = User(
        email = "qwe@naver.com"
    )

    user3.getInfo()
}