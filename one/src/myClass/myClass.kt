package myClass

/**
 * Created by studio on 22/05/17.
 */

//class Man{
//    var name: String = "Joey"
//    var age: Int = 27
//
//    fun walk(){
//        println("I can walk")
//    }
//
//    fun greet(name: String) {
//        println("Hello there, $name")
//    }
//
//}


class Man(name: String, age: Int){
    var name: String
    var age: Int

    init {
        this.name = name
        this.age = age
    }


    fun walk(){
        println("I can walk")
    }

    fun greet(name: String) {
        println("Hello there, $name")
    }

}


fun main(args: Array<String>) {

    var ross = Man("Ross", 28)

    println(ross.name)
    println(ross.age)

//    ross.name = "Ross"

    println(ross.name)


    var adam = Man("Adam", 29)
//    adam.name = "adam"

    println(adam.name)

    adam.walk()

    adam.greet("Eve")


}