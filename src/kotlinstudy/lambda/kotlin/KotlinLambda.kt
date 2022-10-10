package kotlinstudy.lambda.kotlin

import kotlinstudy.lambda.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_050),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    /**
     * 람다를 만드는 방법 1.
     * 함수의 타입 : (파라미터 타입..) -> 반환 타입.
     * 사과면 true 반환.
     */
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    /**
     * 람다를 만드는 방법 2.
     * 사과면 true 반환.
     */
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0]) //람다를 직접 호출하는 방법 1
    isApple.invoke(fruits[0]) //람다를 직접 호출하는 방법 2

    filterFruits(fruits, isApple)
    filterFruits(fruits) { fruit ->
        println(fruit.name)
        fruit.name == "사과"
    }
}

/**
 * filter 라는 함수를 파라미터로 받음.
 */
private fun filterFruits(fruits : List<Fruit>, filter : (Fruit) -> Boolean) : List<Fruit> {
    val results = mutableListOf<Fruit>()

    for(fruit in fruits){
        if(filter(fruit)){
            results.add(fruit)
        }
    }
    return results
}