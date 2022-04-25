fun main(args :Array<String>){
    var arr = arrayOf("A","B","C","D","E")

    // 기본적인 for문
    for(item in arr){
        print(item + " ")
    }

    // 배열, 자료구조에서 indices를 사용하여 인덱스를 가져올 수 있음.
    for(idx in arr.indices){
        print(arr[idx] + " ")
    }

    // range 문법을 이용하여 index값을 가져올 수 있음.
    for(idx in 0..arr.size-1){
        print(arr[idx] + " ")
    }

    // index와 값을 둘다 뽑아올때는 withIndex() 활용
    for((idx, value) in arr.withIndex()){
        println("$idx 번째 값은 $value")
    }

}
