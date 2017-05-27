package myDataClass

/**
 * Created by studio on 23/05/17.
 */


class RegularAPI(val url: String, val apikey: String, val q: String){

}

data class DataAPI(val url: String, val apikey: String, val q: String)


fun main(args: Array<String>) {
    var apicall = RegularAPI("https:///", "apapapapapaphdbd", "google")

    var myapi = DataAPI("http://", "hytur", "facebook")


    println(apicall)
    println(myapi)

    var (url, api, que) = myapi

    println(url)
    println(api)
    println(que)

}

















