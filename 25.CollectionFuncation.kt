fun main(){
    val nums = listOf<Int>(1,2,8,3,4,5,66,4)
    val oddNums = nums.filter(::isOdd) //  High Order funcation
    println(oddNums)
    println(nums.filter {it%2==0}) //lambada function

    //map funcation -> convert one form to another return list
    val squareNum :List<Float> = nums.map { (it/2).toFloat() }
    println(squareNum)

    //foreach ->
    nums.forEach { println(it) }

    var d= nums.iterator()
    //itrator
    while(d.hasNext()){
        println(d.next())
    }
}

fun isOdd(a : Int) : Boolean{
 return a % 2 !=0
}