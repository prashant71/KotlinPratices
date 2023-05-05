import java.util.*

class Employee(nameParam : String, ageParam : Int){
    var name = nameParam
        get() {
            println("Getter fun called")
            return "Mr.$field" //.uppercase(Locale.getDefault())
        }
        set(value) {
           println("namr param set fun called")
            field=value.uppercase()
        }

    var age = ageParam
       get(){
           println("Age Param Get fun called")
           return field+1}
       set(value) {
        println("Setter fun called")
        if(value>0){
            field=value
        }else println("Age can't be negative")
    }

    /**
      var default : String = "gettersetter_set_by_default_like_below"
      get() = field
      set(value) {
        field=value
      } */

}
fun main(){
    val emp = Employee("Physics",21)
    println(emp.name)
    println(emp.age)

    emp.age=-14
    println(emp.age) //setter not worked due to false if condition so keep previous value as it is.

    emp.name="Robust"
    println(emp.name)

}