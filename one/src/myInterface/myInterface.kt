package myInterface

/**
 * Created by studio on 23/05/17.
 */


interface Image {
    var fileName: String
    var fileSize: Double
    var height: Int
    var width: Int

    fun save()

}

interface Something {
    fun network()
}

class Png(val name: String): Image, Something{
    override var fileName = "coolpic"
    override var fileSize = 20.8
    override var height = 34
    override var width = 44

    override fun save(){
        println("Save this image on firebase")
    }

    override fun network(){
        println("I save on local network")
    }
}










