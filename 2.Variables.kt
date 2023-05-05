
var topLevelVar : String = "Top Level Variable"

fun main(){
     /** variables :
     * var  ---> value can be reassigned,
     * val  ---> value can't be reassigned */

     var a  = 40 //Data Type Inferred
     var b : Int = 110 //Immediate assignment

    val message :String
    message="Like Constant" //deferred assignment
    println(message)
    println(topLevelVar)

//  we can modify an object stored in val
    val language = mutableListOf<Any>("Java")
    language.add("Kotlin")
    language.add(50)
    println(language.toString())

    /** DataTypes */
    /** Explicitly Define DataTypes for var and val to force that variable accepts these type of data only */

    var byte : Byte = 127 // -127 to 127
    var short : Short = -32768 // -32768 to 32767
    var count :Int=0
    var longValue: Long = 1_000_00  //_ underscore at first not allowed for literal(value store at variable)
    println(longValue)
    val pi : Float = 302.1f
    var decimal : Double = 2.003
    var type : Char = 'F'  // single char in single quote
    var name : String = "Kotlin"
    var isValid : Boolean=false

}