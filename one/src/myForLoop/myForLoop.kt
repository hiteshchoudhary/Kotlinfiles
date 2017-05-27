package myForLoop

/**
 * Created by studio on 21/05/17.
 */

fun main(args: Array<String>) {

    for (i in 1..100){
        println(i)
    }

    val listofSuper = listOf("Superman", "spiderman", "batman", "hulk")

    for (man in listofSuper){
        println(man)
    }


    for ((i, man) in listofSuper.withIndex()){
        println("at position $i, come $man")
    }

    var sum = 0

    for (i in 1..120){
        sum = sum + i

    }
    println(sum)

}