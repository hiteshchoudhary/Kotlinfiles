package gradeSystem

/**
 * Created by studio on 21/05/17.
 */


fun main(args: Array<String>) {
    var myScore: Int = 95
    val passingScore: Int = 40


    if (myScore > 90){
        println("Your grade is A and your score is $myScore")
    } else if (myScore > 75) {
        println("Your grade is B and your score is $myScore")
    } else if (myScore > 60){
        println("Your grade is C and your score is $myScore")
    } else if (myScore > 40){
        println("Your grade is D and your score is $myScore")
    } else {
        println("you didn't performed well in the test")
    }


}
