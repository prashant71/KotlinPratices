open class OuterClass(){
    init {
        println("Outer class constructor called")

    }

    protected var outerVariable : String = "outerVariable ${InnerClass().innerVariable}"

     fun displayOuter(){
         println("Outer class display called ")
     }

   class NestedClass{  // : OuterClass() //able to inherit nested pattern class
    init {
        println("Nested class constructor called")
//      println("access outer variable by inheriting $outerVariable")
    }
        var nestedVariable_a : String = "nestedVariable_a"
        fun display(){
            println("nested class fun called")
            println("Not access outer class variable inside nested -outerVariable-")
        }
    }


     inner class InnerClass(){
        init {
            println("Inner class constructor called")
        }

        val innerVariable = "innerVariable"
        fun display(){
            displayOuter() // access outer class member
            println("Inner class fun called")
            println("Able to access outer class variables  $outerVariable") // access outer class property
        }

    }
}


/** Class Animal --> Class Dog,Cat, Parrot and Fish
 * Nested class --> HealthyCondition(age,features,water contamination)-all animals health depend on different factors
 * so according to Animal class we can nest different classes which are not useful for others
 * Inner --> this is on top of nested class just where we want to access outer class properties in side inner class like age of animal parrot
 * to consider it in health condition of it*/

class inherit : OuterClass(){
    fun showAccessdetails(){
        println("Parent variable $outerVariable")
        displayOuter()
        println("Parent's Nested class variable")
    }
}
/**
 * 1.Nested class is static in nature
 * 2.Access nested class property and fun by dot operator not need to create outer class object
 *
 * Inner class is non static
 * Access inner class property and fun by creating object of outer class.
 * Inner class can access members and property of outer class */

fun main(){
    var nestedObj = OuterClass.NestedClass()
    nestedObj.display()
    println(nestedObj.nestedVariable_a)

//    println()
//    var innerObj = OuterClass().InnerClass() //create outer class object 1st then access inner class
//    innerObj.display()
//    println("Inner class properties ${innerObj.innerVariable}")
}
