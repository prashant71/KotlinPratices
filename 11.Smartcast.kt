import java.lang.ClassCastException

/** Typecheck (is) and Cast (as) ---> Smart Cast('is' return true) and safe cast (as?)
 *
 * 'is' for typecheck and cast it if it is true(smart-cast) in condition statement else not cast
 *
 * Regular casts may result in a ClassCastException if the object is not of the target type.
 * Another option is to use safe casts that return null if the attempt was not successful 'as?'*/

interface Shape{
    fun calculatearea() : Int
}

class Circle : Shape {
    var radius : Int = 5
    override fun calculatearea() : Int {
        return (22*radius*radius)/7
    }

}
class Rectangle : Shape {
    var length : Int = 0
    var height : Int = 0
    override fun calculatearea() : Int {
       return length*height
    }

}
class Square : Shape {
    var side : Int = 0
    override fun calculatearea() : Int {
        return  side*side
    }
}

fun main(){
    val shapeObject : Shape = when(2){
        1 -> Circle()
        2 -> Square()
        else -> Rectangle()
    }

//    shapeObject.radius=0  // compile error

    if(shapeObject is Circle){ // if true then cast it automatically (smart-cast)
        println("This is Circle")
        if(shapeObject.radius is Int)// =10 //after smart cast properties if circle can be accessible
        println(shapeObject.calculatearea())
    }else if (shapeObject is Square){ // if true then cast it automatically (smart-cast)
        println("This is Square")
        shapeObject.side =2
        println(shapeObject.calculatearea())
    }else if(shapeObject is Rectangle){
        println("This is Rectangle")
        shapeObject.length = 10
        shapeObject.height = 12
        println(shapeObject.calculatearea())
    }

    //negate type-check
    if(shapeObject !is Circle){
        println("This is not Circle")
    }else if (shapeObject !is Square){
        println("This is not Square")
    } else if (shapeObject !is Rectangle){
        println("This is not Rectangle")
    }


    /* Automatically cast the right-hand side of && to Circle */
    if (shapeObject is Circle && shapeObject.radius > 5){
        println("Circle with radius more than 5")
    }
    /* Automatically cast the right hand side of || to Sqaure */
    if (shapeObject !is Square || shapeObject.side < 3 ){
        println("Either not square or it is square with side lenght less than 3")
    }

    /* Explicit cast by using 'as'*/
 // run time class cast exception so use safe cast
    var nullableShapeObject : Circle? = shapeObject as Circle
    nullableShapeObject?.radius

         try {
             var otherShapeObject : Circle = shapeObject as Circle
             print(otherShapeObject.radius)
         }catch (e: ClassCastException){
             println("Class is not able to cast")
         }



    /** The above explicit cast is unsafe as it can throw an exception if the cast is not possible.
    *  That’s why as operator called as unsafe cast operator.
    *  Instead, we can use a safe cast operator as? where it assigns a null value if the cast is not possible
    *  without throwing an exception.*/

    var nullableShape : Circle? = shapeObject as? Circle // this is safe cast

    //by negate return false still it can smart cast in else block
    if(shapeObject !is Square){
        return
    }else {
        shapeObject.side = 15
    }
}
