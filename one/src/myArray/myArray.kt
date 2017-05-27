package myArray

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by studio on 21/05/17.
 */

fun main(args: Array<String>) {

    var marvelOne = arrayOf("IronMan", "Spiderman")

    var mixedArray = arrayOf("One", 1, 3.0)

    mixedArray[0] = "Two"

    println(mixedArray[0])

    var myNumArray = intArrayOf(1, 2, 3, 4, 5)

    println(myNumArray[0])

    var marvelTwo = arrayOf("Captain America")

    var marvelTeam = marvelOne + marvelTwo

    println(marvelTeam.size)


    println(marvelTeam.isEmpty())

    if (marvelTeam.contains("Spiderman")){
        println("We got spidy this time")
    } else {
        println("Got no spidy")
    }

}