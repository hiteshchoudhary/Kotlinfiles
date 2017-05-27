package myArrayList

/**
 * Created by studio on 21/05/17.
 */


fun main(args: Array<String>) {

    var myArrayListCar = arrayListOf("BMW", "Audi", "City", "Civic", "Nano")

    var myArrayListBike = arrayListOf("Harley")

    println(myArrayListCar[2])


    println(myArrayListBike + myArrayListCar)

    println(myArrayListCar.size)

    println(myArrayListCar.isEmpty())

    println(myArrayListCar.contains("City"))

    myArrayListBike.add("BMW")
    println(myArrayListBike)

    myArrayListBike.remove("Harley")
    println(myArrayListBike)

    val myNewCars = myArrayListCar.subList(1, 3)
    println(myNewCars)

}