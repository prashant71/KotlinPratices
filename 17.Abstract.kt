
/** Protocol or abstract is placeholder:
 * 1.abstract is by default open
 * 2.abstract class have both abstract and non-abstract methode/properties
 * 3.abstract methode don't have body it just have fun signature
 * 4.restrict to create instance of particular class and force to implement abstract method in child class to follow protocol
 * 5.we can make abstract to override fun to force to next class to implement*/
abstract class Polygon{
    abstract var printCopy : Int
    abstract fun draw()
    open fun fill(){
        println("Fill fun in Polygon")
    }
}

open class Rectangle1 : Polygon(){
    final override var printCopy: Int =2 //make it final - not able to override in next inherited class

    override fun draw(){
          println("Draw in Rectangle")
      }
}
 class PartRectangle : Rectangle1(){
     override fun draw() {
         println("Draw in PartRetangl")
     }

     override fun fill() {
         super.fill()
     }
 }


abstract class Employee1(val name: String,val experience: Int) {   // Non-Abstract
    // Property
    // Abstract Property (Must be overridden by Subclasses)
    abstract var salary: Double
    var tds : Int = 7
    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
     fun employeeDetails() {
        println(javaClass)
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}
// derived class
class Engineer(name: String,experience: Int) : Employee1(name,experience) {
    override var salary = (500000.00*tds)/1006

    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }

}


fun main(){
    val rect = Rectangle1()
    rect.draw()
    rect.fill()


    val eng = Engineer("Praveen",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}