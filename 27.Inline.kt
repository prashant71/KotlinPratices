
/**In Kotlin/JVM, function types (lambdas) are converted to anonymous/regular classes that extend the interface Function
 * Inlining is basically requesting the compiler to copy the (inlined) code at the calling place.*/

fun main(){
  var lambda : (Int) -> Unit = {for (a in 0..it){

  } }
    calculatTime(100,lambda)
    calculatTime(50,lambda)
    calculatTime(25,lambda)
}

inline fun calculatTime(i: Int,fn : (Int) -> Unit) {
    fn(i)
    println("Done")
}

