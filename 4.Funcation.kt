import kotlin.math.pow

/** Function can define everywhere in Kotlin * */

 /** 1.Top Level Function */
 fun topLevel(){
     println("Top level Function")
 }

 /** 2.Class member Function */
class DemoClass{

    fun memberfun(){
        println("Member Function")
    }
}

 /** 3.Local Function */
 fun functionA(){
     fun funcationB(){
         println("Local Function B inside function A")
     }
     println("Function A")
     funcationB()
 }

 /** Function Overloading --> same fun name with different parameters i.e input parameters Type Or Count should be different  return type dosen't matter cz it is statically typed check at compile time*/

 fun sum(a : Int,b : Int) : Int{
     return  a + b
 }

 fun sum(a : Double,b : Int) : Double{
     return a + b
 }

 /**  fun as an expression */
// fun sum(a : Int,b : Int,c : Int) : Int = a+b+c
 fun sum(a : Int,b : Int,c : Int) = a+b+c


 /** The function which doesn't return any value  then we can mention return type is Unit as like 'void' in java
  *  we can omit Unit */
 fun evenOdd(a : Int) : Unit{
     var result = if(a%2==0) "Even" else "Odd"
     println(result)
 }

/** Default arguments
 * when arguments are not passed then fun will take default value if we are already provided default value to fun */
 fun printmsg(count : Int=2){ // parameters -- > param are val type we can not able to re-assign
     for (i in 1..count){
         println("Hello,Default argument $i")
     }
 }


 fun power(a : Double,b : Int) : Double {
     return  a.pow(b)
 }

 fun main(){

        
     topLevel()
     DemoClass().memberfun()
     functionA()

     //Return Data type as we mention in fun declaration
     var result = sum(20,5);
     println(result)

     println(sum(12.2,3))

     //Return Unit Type
     evenOdd(12)
     evenOdd(5)

     println("Argument passed as 3")
     printmsg(3) // arguments
     println("Argument not passed it taken from default")
     printmsg()

     // Named arguments --> if fun have more param then sometime quite difficult which param assign which argument
     println(sum(c=1,a=9,b=80))

     // store function as variable --> assign fun to variables '::'
    // again we can assign another fun to variable but both the fun has same signature
     var fn: (a: Double, b: Int) -> Double = :: power
     println(fn(2.3,10))
     fn = :: sum
     println(fn(2.3,10))


 }


