package defaultValues

/**
 * Created by studio on 22/05/17.
 */


class Course(val courseName: String, val courseType: String = "Video", val coursePrice: Int){

    fun printCourse(){
        println("Course details [name=$courseName, type=$courseType, price=$coursePrice]")
    }
}

fun main(args: Array<String>) {
    val python = Course(courseName = "Python Course", coursePrice = 200)
    python.printCourse()

    val kotlin = Course(courseName = "Kotlin course", coursePrice = 100, courseType = "Video")
    kotlin.printCourse()
}
