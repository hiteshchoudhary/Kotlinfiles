package myAbstractClass

/**
 * Created by studio on 23/05/17.
 */



abstract class Account(open val name: String, open val balance: Int){

    fun printDetails(){
        println("Bank Person details are: [name: $name, balance: $balance]")
    }

    abstract fun welcomeMsg()

    open fun accountTypeMsg(){
        println("Hey $name, Welcome to simple account")
    }

}

class SavingAccount(override val name: String, override val balance: Int): Account(name, balance){

    override fun accountTypeMsg() {
        println("Hey $name, welcome to saving account")
    }

    override fun welcomeMsg(){
        println("My custom welcome msg")
    }
    fun addInterest(){
        println("I will give you 12% of interest")
    }

}



fun main(args: Array<String>) {
//    var adam = Account(name = "Adam", balance = 5000)
//    adam.accountTypeMsg()


    var ross = SavingAccount(name = "Ross", balance = 500)
    ross.accountTypeMsg()
    ross.addInterest()
}
















