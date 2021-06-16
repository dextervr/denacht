package rooms

import base.Player

import game.weapons.Nagelschaartje

class badkamer(var p:Player) {
    fun main(){

        println("\u000cJe bevindt je nu in de badkamer en kijkt goed om je heen naar een wapen om jezelf te verdedigen.\n" +
                "Er is een nagelschaartje in de la, pak hem op.\n\n(P) Pak op")
        var nagelschaartje = getNagelschaartje()
        if(nagelschaartje.first) {
            p.weapons.add()
            println("Je hebt nu een nagelschaartje, dat kun je gebruiken om jezelf te verdedigen")
            Thread.sleep(1000)
            println("")
        }
        else {
            println("Er is iets misgegaan, restart de game!")
        }
    }
    fun getNagelschaartje(): Pair<Boolean, base.weapon> {
        val input = readLine()?.toLowerCase()
        if(input == "p" || input == "pak op") {
            return Pair(true, Nagelschaartje("Nagelschaartje", 10))
        } else {
            println("Hey, je hebt dit nagelschaartje echt nodig! Druk P om hem op te pakken.")
            getNagelschaartje()
            return Pair(false, Nagelschaartje("Nagelschaartje", 10))
        }
    }

}


