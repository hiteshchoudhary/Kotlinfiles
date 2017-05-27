package myAirlineSeat

/**
 * Created by studio on 23/05/17.
 */


enum class SeatType{
    WINDOW, AISLE, MIDDLE
}

class SeatReservation{

    fun seatPref(seatType: SeatType){
        println("Your seat is $seatType")
    }
}




fun main(args: Array<String>) {
    var peter = SeatReservation()

    peter.seatPref(SeatType.MIDDLE)

    var sarah = SeatReservation()
    sarah.seatPref(SeatType.WINDOW)


}