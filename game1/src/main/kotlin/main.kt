fun main(args: Array<String>) {
    val username = " kkr aap "
    val tino = Enemy("Valentino", 100)
    val kamer = Kamer(username, tino)

    println("Voer hier u naam in")
    var username = readLine()

    kamer.Inleiding()

}