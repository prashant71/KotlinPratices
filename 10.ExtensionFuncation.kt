import com.sun.jdi.FloatType

/** Extension Function :
 * Kotlin provides the ability to extend a class or an interface with new functionality
 * without having to inherit from the class or use design patterns such as "Decorator (Structural pattern)".
 * This is done via special declarations called extensions.
 *
 * To declare an extension function, prefix its name with a receiver type,
 * which refers to the type being extended.*/


fun String.getCharAt(index : Int): Char {
    return this[this.length - index]
}

/** In a member of a class, this refers to the current object of that class.
 * In an extension function or a function literal with receiver this denotes the receiver parameter that is passed on
 * the left-hand side of a dot.
 * inside an extension function corresponds to the receiver object */

fun String.lastChar( )  = get(length-1)

fun String.formattedString(){
    println("--------------------- \n $this \n---------------------")
}

fun Int.arithmaticOperations(a : Int){
    println("Sum is : ${this + a}")
    println("Subtraction is : ${this - a}")
    println("Multiplication is : ${this * a}")

}

/** The following adds a swap function to MutableList<Int>,String,Int:*/
//generic type function <T>
fun <T>MutableList<T>.swap(index1:Int,index2:Int){
    var temp = this[index1]
    this[index1]=this[index2]
    this[index2]=temp
}

fun <T>MutableList<T>.retrive(index : Int) : MutableList<T>{
    return this.subList(0,index)
}

/** Extensions are resolved statically :
 * https://kotlinlang.org/docs/extensions.html#extensions-are-resolved-statically
 * Extensions do not actually modify the classes they extend. By defining an extension,
 * you are not inserting new members into a class,
 * only making new functions callable with the dot-notation on variables of this type.
 * Because the extension function being called depends only on the declared type of the parameter base in printclass method,
 * which is the BaseClass class. line-70
 * This is different from runtime polymorphism as here it is resolved statically but not at the runtime.
 * It completely depends on which class object is calling the function and
 * the extension function of that class only will be called which is why it is called static.
 * The basic difference between extension functions and inheritance is references are resolved statically
 * in extension functions whereas, in inheritance, it is resolved by run time polymorphism */

open class BaseClass{
    open fun classfun(){
        println("This is class fun : Baseclass")
    }
}
//inherit the baseclass
class DerivedClass : BaseClass(){
    override fun classfun(){
        println("This is class fun : Derived-class")
    }
    fun BaseClass.fullname(){
        classfun()
    }
}

//Extension functions

fun BaseClass.printclassname(){
    println("This is Base class's extension fun")
}
fun DerivedClass.printclassname(){
    println("This is Derived class's extension fun")
}


fun printclass(c : BaseClass){
    c.printclassname()
}

/** If a class has a member function, and an extension function is defined which has the same receiver type,
 * the same name, and is applicable to given arguments, the member always wins.*/
fun DerivedClass.classfun(){
    println("This is Extension fun")
}

/** Note that extensions can be defined with a nullable receiver type.
 * These extensions can be called on an object variable even if its value is null,
 * and they can check for this == null inside the body. */

fun String?.checkNull() : String{
    if (this == null) return "Value is null"

    return toString()
}

/** Extension Proprties :
 * Since extensions do not actually insert members into classes,
 * there's no efficient way for an extension property to have a backing field.
 * This is why initializers are not allowed for extension properties.
 * Their behavior can only be defined by explicitly providing getters/setters.*/

class Temprature(var celsius : Float)
var Temprature.fahrenheit : Float
    get() = (celsius * 9 / 5) + 32
    set(value) {
        celsius = (value - 32) * 5 /9
    }


/**companion object extension
 * */
class Myclas{
    companion object { }
}

fun Myclas.Companion.print(){
    println("this is companion objects extension fun")
}

fun main(){
    //Normal Way to print String
    val name = "Alexa"
    println(name)
    //Add function in String class --> possible only when class is open
    name.formattedString()
    println(name.lastChar())

    val i = 10
    val j = 20
    i.arithmaticOperations(j)

    val listChar = mutableListOf("s","a","r","t","k")
    // val listInteger = mutableListOf(1,7,23,9,76,34)
    println(listChar)
    listChar.swap(0,3)
    println(listChar)

    println(listChar.retrive(2))
    /* Extensions are resolved statically */
    printclass(DerivedClass())

    //priority to class fun over extension fun if you have same name and signature
    val dc = DerivedClass()
        dc.classfun()

    //Nullable receiver type ?
    val a : String?= null
    println(a.checkNull())

    val t = Temprature(36f)
    println(t.fahrenheit)
    t.fahrenheit=96.8f
    println(t.celsius)

    Myclas.print()
}