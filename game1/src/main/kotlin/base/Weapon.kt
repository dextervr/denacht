package base



// basis class voor alle game weapons

val Nagelschaartje = weapon("nagelschaartje" ,10)


open class weapon (val name: String, val damage: Int)
{
    override fun toString(): String{
        return "Name: $name, damage: $damage"
    }
}