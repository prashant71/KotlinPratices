/**1.Interface is a contract
 * 2.classes divide based on the behaviour rather than what they are*/

interface Draggable{
    fun drag()
}

abstract class Shape2 : Draggable{
    abstract var dragSpeed : Int
}

class Oval(override var dragSpeed: Int) : Shape2(){
    override fun drag() {
       println("Oval Dragged by speed $dragSpeed")
    }
}

class Roumbos : Shape2() {
    override var dragSpeed: Int = 0
        get() = 25
        set(value) {
            field = value
        }

    override fun drag() {
        println("Rombous Dragged by speed $dragSpeed")
    }
}
class Player : Draggable{
    override fun drag() {
        println("Player Dragged")
    }
}

fun main(){
 dragObject(arrayOf(Oval(15),Roumbos(),Player()))
}
fun dragObject(objects : Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }

}