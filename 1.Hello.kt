//Entry point of program
// Before Kotlin 1.3 main fun need Array<String> param after next release fun can accept zero param
//fun main(){
//    print("empty Main")
//    main(arrayOf(1))
//}
fun main(args : Array<Int>){
    print("Main fun with Int ${args[0]}")
}
fun main(args : Array<String>){
    println("Hello Kotlin with Array String")
    main(arrayOf(1,21))
}