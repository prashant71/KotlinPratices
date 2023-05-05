 fun main(){
    val isRaining=true
    if (isRaining){
        println("Please Take Umbrella")
    }else {
        println("There is No Rain, Enjoy day")
    }

    /** If-Else As Expression -->
     * we can assign result directly to variable
     * when If block has only one statement we can make it as expression
     * if has multipal statement then last statement get assigned to variable*/


    val a = 10
    val b = 20

    var higherNumber : String =if (b<a){
                                     "a is Greater"
                                }else if(a<b) {
                                    "b is Greater"
                                    "B is greater but assign second line"
                                } else{
                                    "Both are equal"
                                }

     println(higherNumber)

    //Inline
    var higherNumber1 =if (b<a) "a is Greater" else if(a<b) "b is Greater"  else if(a==b) "both are equal" else "Input is not valid"
    println(higherNumber1)

    //when can be empty also,add condition inside when and return
    val great_no = when{
        a>b -> "A is greater"
        b>a -> "B is greater"
        else -> "Both are equal"
    }
    println("When ->$great_no")

    //instead of using multiple If-else (cascading) we can use When it is more readable
    val animal = "Dog"
    when(animal){
        "Horse" -> println("This is Horse")
        "Dog"   -> println("This is Dog..ehuuu")
        "Cat"   -> println("This is cat..mueooo")
         else   -> println("Animal not found")
    }

    //'when' can be use as an Expression
    //'is' used to check and automatic cast
    var test : Any = 20.5f
    var result = when(test){
        10 -> "Ten"
        is String -> "yes,it is string"
        in 15..20 -> "In range of 15 to 20"
        !is Int -> "Not Int datatype"
        else -> "except check"
    }

    println(result)
}