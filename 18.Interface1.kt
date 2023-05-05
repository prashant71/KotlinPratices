/**1.class can implement multiple Interface
 * 2.Interface can implement Interface
 * 3.Interface have abstract and non-abstract method
 * 4.Property initializers are not allowed in interfaces need to implement getter and setter is not possible due to backing field
 * and Property in an interface cannot have a backing field
 * 5.We can override Base class's non-abstract method in current class or this method can get added into current class directly
 * 6.implement 2 or more interface which has same name non-abstract method's then we can get supertype by mentioning super<classname> to resolve ambiguity*/

interface Action{ //in interface all nonbody fun is by default abstract
    var right : Int
   fun drag()  //
   fun click(){  //normal fun public and open by default
        println("${javaClass} -->Action - Click event $right")
    }
}

interface DualAction{
    fun click(){
        println("${javaClass} -->DualAction - Click event")
    }
}

interface SmallAction : Action{
    fun smallAction()
    override fun click() {
        super.click()
        println("${javaClass} -->SmallAction - Click event $right")
    }

    override fun drag() {
        println("${javaClass} -->SmallAction - Drag event")
    }
}

class Button : SmallAction,DualAction{
    override fun smallAction() {
        println("${javaClass} -->Button - small action event")
    }

    override fun drag() {
        super.drag()
        println("${javaClass} -->Button - Drag event")
    }

    override var right: Int = 10

    override fun click() {
        super<DualAction>.click()
        super<SmallAction>.click()
        println("${javaClass} -->Button - Click event")
    }

//    override var right: Int = 5


}
fun main(){
    val b = Button()
    b.click()
    b.drag()
}