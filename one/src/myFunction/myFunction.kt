package myFunction

import java.util.*

/**
 * Created by studio on 21/05/17.
 */


fun sayHello(name: String){
    println("I am $name ")
    println("hello there, $name")
}


fun crazyStringer(sample: String){
    for (s in sample){
        print(s + "-")
    }
}

fun getDate(): Date{
    return Date()
}


fun main(args: Array<String>) {
    sayHello("John")
    sayHello("Sarah")
    crazyStringer("Kolinisgreat")
    println()
    println(getDate())
}