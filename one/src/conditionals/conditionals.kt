package conditionals

/**
 * Created by studio on 20/05/17.
 */

fun main(args: Array<String>) {

    val highScore: Int = 200

    var currentScore: Int = 200

    if (currentScore < highScore){
        println("You missed the high score")
    } else if (currentScore == highScore) {
        println("You are exactly on higScore")
    } else {
        println("Congrats on high score")
    }


}

