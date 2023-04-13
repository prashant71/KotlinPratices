/**1.Only one object is created at once -> i.e. singleton pattern class
 * 2.Use object keyword instead of class
 * 3.Can inherit class and interface
 * 4.No Constructor is allowed cause restrict to create multiple objects init block is allowed
 * 5.Logger object for Application to log EXCEPTION/ ERROR at one place / Likes for application
 * 6. Possible to make Anonymous class by inheriting Class and Interface -
 *      Object expressions create objects of anonymous classes, that is,
 *      classes that aren't explicitly declared with the class declaration.
 *      Such classes are useful for one-time use. You can define them from scratch,
 *      inherit from existing classes, or implement interfaces. Instances of anonymous classes are also calledBVF/R
 *      anonymous objects because they are defined by an expression, not a name.*/
/**Object Declration*/

object ObjectA{
    var likecount : Int = 0
    fun getDetails(){
        println("Likes :$likecount")
    }
}


object ObjectB : Parent1() {
    init {
        println("ObjectB init")
    }
    override var name : String = ""
    fun getDetails() : String{
        return "Name is $name"
    }
   /* override fun toString(): String {
       return "okkk"
    }*/

}
fun main(){
    //Object Declration
    var obj1 = ObjectA
    obj1.likecount++
    println(obj1.toString())
    obj1.getDetails()

    var obj3 = ObjectA
    obj3.likecount++
    println(obj3.toString())
    obj3.getDetails()
    obj1.getDetails()

    var obj2 = ObjectB
    println(obj2.toString())

    var acces = "accessible"

    /**Object Expression and anonymous object*/

    var objExpression = object : Parent1(),Clonable {
        var expression: String = obj2.name
        fun getExpr(): String{
            return expression
        }

        override fun Clone() {
            println("Is Cloned")
        }
    }

    objExpression.expression = "asign"
    println(objExpression.getExpr())
    objExpression.Clone()
    objExpression.getFamilyDetails()

}

interface  Clonable{
    fun Clone()
}