package effective.part1

import java.lang.Exception
import kotlin.concurrent.thread

class BankCount{
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double){
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawAmount : Double){
        if(balance < withdrawAmount){
            throw InsufficientFunds()
        }
        balance -= withdrawAmount
    }

}

class InsufficientFunds : Exception()

fun main(args :Array<String>){
    val account = BankCount()

    println(account.balance)
    account.deposit(100.0)
    println(account.balance)
    account.withdraw(50.0)
    println(account.balance)

    var num = 0
    for(i in 1..1000){
        thread {
            Thread.sleep(10)
            num+=1
        }
    }
//    Thread.sleep(5000)
    println("num2 = ${num}")

    println(fizz.javaClass)
    println("--- call fizz 1 ---")
    println(fizz)
    println("---call fizz 2---")
    println(buzz.javaClass)
    println("---call buzz 1---")
    println(buzz)
    println("---call buzz 2---")
}

fun calculate(): Int{
    print("Calculating...")
    return  42
}

val fizz = calculate()  // return 값만 적용
val buzz
    get() = calculate() // get을 통한 calculate 전체 로직 실행