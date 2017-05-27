package emailGen

/**
 * Created by studio on 22/05/17.
 */


fun emailGen(list: List<String>): List<String>{
    var result = arrayListOf<String>()

    for (emp in list){
        result.add(emp + "@somecompany.com")
    }
    return result
}


fun main(args: Array<String>) {
    val members = listOf("John", "Sarah", "Sunil", "Methew", "ram")
    println(emailGen(members))
}