package whenCon

/**
 * Created by studio on 21/05/17.
 */


fun main(args: Array<String>) {

    var score: Int = 11


    when (score) {
        !in 5..10 -> println("not in range of 5 to 10")

        3 -> {
            println("You got high score")
            println("Your score is 3")
        }
    }


}