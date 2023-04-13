/** Exceptions -->
 * Exception class is inherited from Throwable class */

/** throw --> To throw an exception explicitly */
fun throwException(i: Int) {
    //Exception raise
    if(i<0) throw NumberFormatException("Number Should be positive")
    else println("Number is positive $i")
}

/** The throw expression has the type Nothing
 *  This type has no values and is used to mark code locations that can never be reached.
 *  In your own code, you can use Nothing to mark a function that never returns except null and throws an exception. */
private fun fail() : Nothing?{
    println("Return Nothing datatype -> to mark a function that never returns")
//    throw Exception("Exception sent") //(always throws an exception)
    return null                     // Or return null
//    return 20 // error
}

/** try-catch --> To catch an exception
 * There may be zero or more catch blocks, and the finally block may be omitted.
 * However, at least one catch or finally block is required.
 * */

fun catchException(){
    try {
//        var n : Int="b".toInt()
        println("Try Block")
    }catch (nfe: NumberFormatException){
        println("Catch Block --> NFE")
    }catch (e: Exception){
        println("Catch Block")
    }finally {
        println("Final Block")
    }
}

/** Try is an expression which means it can have a return value:
* The returned value of a try expression is either the last expression in the try block or the last expression in the catch block (or blocks).
* The contents of the finally block don't affect the result of the expression.*/

/** Elvis Operator '?:' --> The elvis operator in Kotlin is used for null safety.
 * a ?: b is just shorthand for if (a != null) a else b.
 *
 * The Elvis operator in Kotlin is an operator that receives two inputs and
 * returns the first argument if it is non-null or the second one otherwise(Default value given by us).
 * It is fancily called the null-coalescing operator.
 * It is a variant of the ternary operator but for null-safety checking.
 * */

/** the safe call operator '?.'(explanatory and dot) can accept null also
 * Safe calls are useful in chains.
 * bob?.department?.head?.name
 * Such a chain returns null if any of the properties in it is null
 *
 * If either `person` or `person.department` is null, the function is not called:
 * person?.department?.head = managersPool.getManager()
 */

fun main(){
    //1
    var x: Nothing? = null // 'x'(null) has type Nothing? datatype
    var l = listOf(null) // 'l' has type List<Nothing?>'
    println("this is value of null i.e. Nothing? datatype : $x") // null

    //2
    throwException(3)
    try {
        throwException(-2)
    }catch (e : Exception){
        println(e.message)
    }

    catchException()

    //3 Elvis Operator '?:' for null-safty
    // safe call :-->  '?.' check is null false-> return value and true-> return null
    val name :String?  = "null"
    var s = name?.length ?: "ok"
    println(s)


    //4
    // Try is an expression
    val input = "m"
    var value : Int?=try {
        input.toInt()
        1 // return -> last line of the block assign to variable if we have multiple lines in try block same for catch block too
    }catch (e : NumberFormatException){
        null
//        e.toString()
    }finally { // not execute at all while we assigning it to as expression
        2
    }
    println(value)

   //5
    val count = "abcd".length
    println(count)
    println("returned from Nothing ${fail()}")

}