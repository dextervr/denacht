package base

open class Enemy(val name: String, var health: Int) {

    fun groet() {
        println( "hallo, ik ben $name en ik heb $health\n health")
    }
}