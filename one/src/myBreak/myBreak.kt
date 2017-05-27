package myBreak

/**
 * Created by studio on 21/05/17.
 */


fun main(args: Array<String>) {

    for (v in "mhhhttyyppaaoaannneyy"){
        if (v == 'o'){
            continue
        }
        println(v)
    }
    println("I am outside the for loop")


    var users = listOf("samz", "john", "sarahz", "sunil", "kapil")

    for (u in users){
        if (u.contains('z')){
            continue
        }
        println(u)
    }

}