/*enum class Month(name : String){
    JAN("January"), //String param
    FEB(2) // Int param
}*/
// in enum create same datatype  object constant
//if we need cistom datatype object constant then sealed class come into picture
//class >> sealed class << Enum class

sealed class ObjectShape(){
     class Circle(name: String,var radius : Int) : ObjectShape()
     class Square(name: String, var side : Int) : ObjectShape()
     class Rectangle(name: String, var height : Int, var breath : Int) : ObjectShape()
     object NotInShape : ObjectShape()
        /*sealed class NotShape(){
            object NotInShape : NotShape()
        }*/
     data class Shape(var name : String,var side : Int ): ObjectShape()

}

fun main(){
    var circle = ObjectShape.Circle("it's Circle",5)
    var rect = ObjectShape.Rectangle("Rect",89,2)
    var noShape = ObjectShape.NotInShape
    var data = ObjectShape.Shape("Dataclass",4)
    areaOfShape(data)
}

fun areaOfShape(shape : ObjectShape) {
    when(shape){
        is ObjectShape.Circle -> println("This is circle with area ${shape.radius * 2/3}")
        is ObjectShape.Square -> println("This is Square with area ${shape.side * shape.side}")
        is ObjectShape.Rectangle -> println("This is Rectangle with area ${shape.height * shape.breath}")
        is ObjectShape.Shape -> println("This is data class ${shape.toString()}")
        ObjectShape.NotInShape -> println("Not in a shape")
    }

}
