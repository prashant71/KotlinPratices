
/** when is like switch in java*/
fun main(){
    /**
     * For Loop -> this is useful when we know the number of iterations
     * Ranges ->
     * */

    println("For Loop -> Ranges(Included End Number)")
    for (i in 1..5){
        println(" values for i $i")
    }
    println("Ranges(Excluded Last number)")
    for (i in 1 until 5){
        println(" values for i $i")
    }

    println("Move by 2")
    for (i in 1..5 step 2){
        println(" values for i $i")
    }

    println("Reverse the range")
    for (i in 5 downTo 1){
        println(" values for i $i")
    }

    //range as an expression return boolean
    var isPresent = 2 in 1..10
    println(isPresent)

}