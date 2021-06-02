fun main(args: Array<String>){


    println("Enter your character name")
    var username = readLine()

    while (username!!.isBlank()) {
        println("please enter a valid username")
        username = readLine()
    }

    println("Your username is $username")

    val kamer = Kamer()
}