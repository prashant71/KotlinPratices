
/** Loops can execute a block of code as long as a specified condition is reached. */
fun main(){

    var i=0;
    /**
     * Do while Loop -> will always be executed at least once
     * The do while loop is a variant of the while loop.
     * This loop will execute the code block once, before checking the condition
     * then it will repeat the loop as long as the condition is true.
     * */

    /** Break - break the loop and exit*/
    println("Do While Loop")
    do {
        i++
        if (i==5) continue
        println("Loop count $i")

    }while (i<10)
    /**
     * While Loop -> Check condition first
     * these loops are useful for infinite iteration till the condition matches
     * continue - skip that iteration and continue*/
    println("While Loop")
    while (i<20){
        i++
        if (i==15) break
        println("Loop count $i")
    }

    /** Any expression in Kotlin may be marked with a label. Labels have the form of an identifier followed by the @ sign
     * A break qualified with a label jumps to the execution point right after the loop marked with that label. */

  loopI@for(i in 1..5){
        println("i is $i")
    loopJ@for(j in 1..3){
            println("j is $j")
            for (k in 1..4) {
                println("k is $k")
                if (k == 3) break@loopJ // default it skip the k loop after break bt after labeling we can shift to I and J loop and skip that loop after break
            }
        }
    }
    foo()
    print("returned here")

    var lis = listOf<String?>("One","Two","Three",null,"Four","Five")
    lis.forEach {
        if (it?.length?:0 > 0){
          println(it)
    } }
}


fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    println(" done with explicit label")
}