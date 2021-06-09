class slaapkamer(val name: String) {


    fun Inleiding() {
        println("je zit in de slaapkamer...")
        println("je hoort nog steeds voetstappen..")
        println("het is donker...")
        println("pak de zaklamp en zoek een uitweg")
        println("typ zaklamp en naam van de volgende kamer...")
        println("Wacht niet telang voor je keuzes...")

    }
    //keuze a en b maken
    //A = zaklamp keuken
    //B = zaklamp badkamer
    fun slaapkamer() {
        val enemy = "Tino"
        println( "welkom in kamer $name, de enemy in deze kamer is $enemy")

        val choice = readLine()!!.toLowerCase()
        when (choice) {
            "zaklamp keuken" -> print("zaklamp keuken == je spawned nu in de keuken, wees opgelet de monster kan uit elke hoek komen...")
            "zaklamp badkamer" -> print("zaklamp badkamer == ")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
//        if (choice == "k"){
//            println("je spawned nu in de keuken, wees opgelet de monster kan uit elke hoek komen...")
//            println("zoek wapens om de monster te verwonden...")
//            println("zoek een exit...")
//        }
//        else if (choice == "Z" || choice == "z"){
//            println("je zaklamp heeft maar weinig energie...")
//            println("zoek batterijen...")
//
//        }
//        else if (choice == "B" || choice == "b"){
//            println("je spawned nu in de badkamer, wees opgelet de monster kan uit elke hoek komen...")
//            println("zoek wapens om de monster te verwonden...")
//            println("zoek een exit...")
//
//        }
//        else {
//            println("you've chosen a invalid answer. try again.")
//            slaapkamer()
//        }


    }




}