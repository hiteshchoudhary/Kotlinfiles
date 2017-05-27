package bigThree

/**
 * Created by studio on 21/05/17.
 */

fun main(args: Array<String>) {

    var numberOne: Int = 13
    var numberTwo: Int = 14
    var numberThree: Int = 15

    if (numberOne > numberTwo && numberOne > numberThree){
        println("$numberOne is biggest")
    } else if ( numberTwo > numberOne && numberTwo > numberThree){
        println("$numberTwo is biggest")
    } else{
        println("$numberThree is the biggest")
    }


}