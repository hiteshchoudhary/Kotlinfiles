package gettersAndSetters

/**
 * Created by studio on 24/05/17.
 */

open class Bank {
    var updatedBalance: Int = 20
        get() = field
        set(value) {
            if (value >= 0){
                field = value
            } else {
                this.warning = "Balance should be in positive number"
            }
        }
    var warning: String = ""
    val interestRate = 12.98


}

class Demo: Bank(){

}

fun main(args: Array<String>) {
    val adam =Bank()
    adam.updatedBalance = -200
    println(adam.warning)
    println(adam.updatedBalance)

    println(adam.updatedBalance)
}