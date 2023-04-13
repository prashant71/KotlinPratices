class MyClass{
    var className = ""
    fun getclassName() : String{
        return obj1
    }

   companion object {
       private var obj1 = "companion Object"
       @JvmStatic
         fun getName(){
            println(obj1)
        }
    }

    object AnotherObject{
         var obj2 = "just Object"
        @JvmStatic
         fun getName(){
             println(obj2)
            println(obj1)
         }
     }
}

fun main(){

    MyClass.getName()
    println(MyClass().getclassName())
    MyClass.AnotherObject.obj2="2nd"
    MyClass.AnotherObject.getName()
}


