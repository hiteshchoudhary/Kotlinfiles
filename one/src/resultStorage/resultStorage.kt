package resultStorage

/**
 * Created by studio on 21/05/17.
 */


fun main(args: Array<String>) {

    var score:Int = 5
//    var isLess = true

    var isLess = if ( score < 4){
        "Value is less than four"
    } else{
        "More than four"

    }
    println("I am outside if block")
    println(isLess)

}