/** Nullable values and null checks :
 * A reference must be explicitly marked as nullable when null value is possible. Nullable type names have ? at the end.
 * Kotlin's type system is aimed at eliminating the danger of null references, also known as The Billion-Dollar Mistake.
 * */

fun parseInt(a : String) : Int?{
    return null
}

fun main() {
    /** Regular initialization means non-null by default */
    var nonNullableInt: Int = 1
    /** compilation error */
    //nonNullableInt = null
    /**  can be set to null*/
    var nullableInt: Int? = null

    /** Now, if you call a method or access a property on nonNullableInt, it's guaranteed not to cause an NPE, so you can safely say*/
    println(nonNullableInt.toFloat())

    /** But if you want to access the same property on nullableInt, that would not be safe, and the compiler reports an error */
//    nullableInt.toFloat() //error

    /** Checking for null -> traditional way */

    if (nullableInt != null) {
        print("Not Null")
        nullableInt.toFloat()
    } else {
        println("Null Value")
    }
    /** SAFE CALL '?.'
     * return value if variable is not null, and null otherwise.
     * Safe calls are useful in chains.
     * Such a chain returns null if any 1 of the properties in it is null.
     * */
    println(nullableInt?.toFloat())
    //bob?.department?.head?.name

    /** Elvis Operator '?:' for null-safty */
    val name: String? = "null"
    var s = name?.length ?: "Default value or We can pass null either can throw Exception"
    println(s)

    /** The not-null assertion operator  !!
     * You can write b!!, and this will return a non-null value of b (for example, a String in our example)
     * or throw an NPE if b is null 
     * when we guarantee that value is not null we can use this
     * when we want explicitly Exception when null found and to notify user something by throwing exception
     * If anyone want NullPointerException then he can ask explicitly using this operator.*/
    val l = name!!.length
    println(l)
}