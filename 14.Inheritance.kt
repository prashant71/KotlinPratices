//By default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword:


open class Parent(name:String,occupation : String) {
    var name : String
    var occupation : String

    init {
        println("Parent's constructor called")
        this.name = name
        this.occupation = occupation
    }

    fun getDetails() {
       println("Parent's Details : $name  $occupation")
    }
}

class Child(childname:String,name: String,occupation: String) : Parent(name,occupation){
    var childname : String
    init {
        println("Child's constructor called")
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


}