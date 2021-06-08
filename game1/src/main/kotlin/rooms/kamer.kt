import base.Enemy

class Kamer(val name: String, enemy: Enemy){

    fun Inleiding() {
        println("Welkom $name bij het spel DE NACHT...")
        println("Het is een koude winter nacht..")
        println("Je wordt wakker en hoort voetstappen")
        println("Je kijkt naar buiten, en ziet voetstappen in de sneeuw")
        println("Je schrikt en weet niet wat je moet doen")
        println("Wat ga je nu doen?")

        println("...............................................")
        println("A: Je rent naar de badkamer.")
        println("B: Je rent in paniek naar de woonkamer.")
        println("C: Je besluit je er niks van aan te trekken en gaat verder slapen.")
        println("................................................")



        val choice = readLine()
        if (choice == "A" || choice == "a")
            {
//                badkamer1()
               println("test")
            }
        else if (choice == "B" || choice =="b")
        {
            woonkamer1()
        }
        else if (choice == "C" || choice =="c")
        {
            dood()
        }
        else {

            println("je antwoord staat er niet tussen, probeer het opnieuw")

            Inleiding()
        }

     }

//    fun slaapkamer() {
//    val enemy = "Tino"
//    println( "welkom in kamer $name, de enemy in deze kamer is $enemy")
//    }



    fun woonkamer1(){
        println("test2")


    }
    fun dood()
    {
        println("Helaas je wordt vermoord in je slaap")

    }

}

