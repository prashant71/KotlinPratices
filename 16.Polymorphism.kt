open class Shape1{
   open fun area() : Double{
       return  0.0
    }
}

class Circle1(private val radius: Double) : Shape1() {
     override fun area() : Double{
        return Math.PI*radius*radius
    }

    fun surface() : Double{
        return radius*0.5
    }
}

class Square1(private val side : Double) : Shape1(){
    override fun area(): Double {
        return side*side
    }
}

class Triangle1(var base : Double,var height : Double) : Shape1(){
    override fun area(): Double {
        return 0.5*base*height
    }
}

//call area fun of particular class depend upon which type of object hold by reference i.e. polymorphism
//only work on same property or method which has coman between parent and child class
fun calculateArea(shapes : List<Shape1>){
    for (shape in shapes){
        println(shape.javaClass)
        println(shape.area())
    }
}

fun main(){
    val circle : Shape1 = Circle1(10.0)
    val square : Shape1 = Square1(4.0)
//    println(circle.area())
//    println(square.area())

    var shapes = listOf<Shape1>(Circle1(2.0),Square1(3.6),Triangle1(3.0,7.5))
    calculateArea(shapes)
}
