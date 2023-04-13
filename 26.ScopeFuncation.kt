  /** Several functions whose sole purpose is to execute a block of code within the context of an object.
 *  with a lambda expression provided
 *  There are five of them: let, run, with, apply, and also.
 * */
class Cadet {
    var name: String? = null
    var age: Int? = null
    var ismale : Boolean? = null
}

fun main(){
    // traditional way
    var cadet1 = Cadet()
        cadet1.name = "Aryan"
        cadet1.age = 2
        cadet1.ismale = true

    /**Apply -> 1.The context object is available as a receiver (this).
     *          2.The return value is the object itself.
     *          3.is the object configuration
     */
    var cadet2 = Cadet().apply {
        this.name = "Viraj"
        age = 3  //this can be omiited
        ismale = true
    }

    /**Also -> 1.The context object is available as an argument (it).
     *         2.The return value is the object itself.
     *         3.When you see also in the code, you can read it as and also do the following with the object(do something along with extra).
     */
     val numbers = mutableListOf<String>("One","Two","Three")
     numbers.also { //a -> we can assign it to another variable like this
        println("The list elements before adding new one: $it")
        it.add("Four")
     }
     println(numbers)

    /**Let -> 1.The context object is available as an argument (it).
     *        2.The return value is the lambda result.
     *        3.Let is used to avoid null pointer exception
     */
    val teststring : String? = "hello"
    val len = teststring?.let { testStr ->
        println(testStr)
        println(testStr.reversed())
        println(testStr.uppercase())
        testStr.length

    }
    println(len)

    val nums = mutableListOf("one", "two", null,"three", "four", "five")
    nums.map { it?.length ?: 0 }.filter { it > 3 }?.let(::println)

    /** With -> 1. The context object is available as an argument (this)
     *          2. The return value is lambda result
     *          3. Retrun last line data and datatype
     */
    var result = with(cadet2){
        println(name)
        println(age)
        "Retrun last line data and datatype"
    }
    println(result)

    /**Run -> 1.The context object is available as an argument (this)
     *        2.The return value is lambda result
     *        3. Combination of with and let
     */

    
}