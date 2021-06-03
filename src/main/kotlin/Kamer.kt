class Kamer(val name: String, enemy: Enemy){

    fun Inleiding() {
        println("Welkom $name bij het spel DE NACHT...")
        println("Het is een koude winter nacht..")
        println("Je wordt wakker en hoort voetstappen")
        println("Je kijkt naar buiten, en ziet voetstappen in de sneeuw")
        println("Je schrikt en weet niet wat je moet doen")
        println("Wat ga je nu doen?")

    }
    //keuze a en b maken
    //A = slaapkamer
    //B = woonkamer
    fun slaapkamer() {
        val enemy = "Tino"
        println( "welkom in kamer $name, de enemy in deze kamer is $enemy")
    }


}

