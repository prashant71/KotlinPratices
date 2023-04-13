//Data classes cannot be abstract, open, sealed, or inner.


data class Student(var name:String, val age:Int){}


fun main(){
    val std1 = Student("Snehal",25)
    val std2 = Student("Snehal",25)
    println(std1.hashCode())
    println(std2.hashCode())
    println(std1.toString())
    println(std2.toString())
    println(std1==std2)

    var s3 = std1.copy(age=27)
    println(s3.toString())

    //destructing
    var (a,b) = s3
    println(a)
    println(b)

    println(s3.component2())
    println(s3.component1())
}