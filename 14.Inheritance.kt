/**
 * By default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword
 * All classes in Kotlin have a common superclass, Any, which is the default superclass for a class with no supertypes declared
 * Any has three methods: equals(), hashCode(), and toString()
 */

open class ParentDetails(name1 : String,age1 : Int){
    var name : String = name1
    private var age : Int = age1

    init {
        println("Parent - Init block")
        this.name =name1
        this.age = age1
        println("$name and $age")
    }

    constructor(name : String) :this(name,20){
        println("Parent - second constructor")
        this.name = name
        this.age = age
    }

    constructor() : this("Prashant",10){
        println("Parent - second constructor with zero param")
    }
    open fun getDetails(){
        println("Parent Details : Name is $name . Current Age is $age")
    }
}
class ChildDetails() : ParentDetails("Swap",25){
    private lateinit var c_name : String
    private var c_age : Int = 0

    init {
        println("Child - Init block")
    }
    constructor(name: String,age : Int) : this(){
       c_name = name
       c_age = age
    }
    override fun getDetails(){
        println("Child Details : Name is $c_name . Current Age is $c_age father name is $name" )
    }
}

/*fun main(){

//    var p = ParentDetails()
//    p.getDetails()
    val c = ChildDetails("Swap",6)
    c.getDetails()

}*/
open class Parent(name:String,occupation : String) {
    var name : String
    var occupation : String

    init {
        println("Parent's init fun called")
        this.name = name
        this.occupation = occupation
    }
    constructor(name: String) : this(name,"Default"){
     println("parent second constructor called")
    }
    fun getDetails() {
       println("Parent's Details : $name  $occupation")
    }
}

class Child(childname:String,name: String,occupation: String) : Parent(name){
    var childname : String
    init {
        println("Child's init fun called")
        this.childname = childname
    }
    fun getDetails1(){
        println("Child Details :$childname $name  $occupation")
    }
}

fun main(){
    var child = Child("Swaraj","A","UI/UX")
        child.getDetails1() // Child fun called
        child.getDetails() // Parents fun called
//    val parent = ParentDetails("SnehPrashant",30)
//    parent.getDetails()

}
