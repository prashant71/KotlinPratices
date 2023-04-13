
fun main(){

    /** lambda signature->
     *  */
    val additionLambda : (Int, Int)->Int = { a1, b1 -> a1+b1}
    var arithmaticLambda : (String,Int,Int) -> Unit ={t,a,b->
       when(t){
           "+" -> println("Addition -> ${a+b}")
           "-" -> println("Substraction -> ${a-b}")
           "*" -> println("Multipication -> ${a*b}")
           "/" -> println("Division -> ${a/b}")
           else -> println("No Operation")
       }
    }
     arithmaticLambda("*",134,98)

     function("+",12,45,arithmaticLambda)

}

fun function(s: String, i: Int, i1: Int, arithmaticLambda: (String, Int, Int) -> Unit) {
        arithmaticLambda(s,i,i1)
}

fun addition(x: Int, y: Int, additionLambda: (Int, Int) -> Int) {
 var result = additionLambda(x,y)
    println("Addition of numbers $result")

}
