import base.Enemy
import base.weapon

fun main(args: Array<String>) {


    println("Voer hier u naam in")
    var username = readLine()

    while (username!!. isBlank()){
        println("please enter a valid username")
        username = readLine()
    }



    val tino = Enemy("Valentino", 100)
    val kamer = Kamer(username, tino)

    kamer.Inleiding()

}