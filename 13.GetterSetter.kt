import java.util.*

class Employee(nameParam : String, ageParam : Int){
    var name = nameParam
    get() {
        println("Getter is get called")
        return "Mr.$field".uppercase(Locale.getDefault())
    }
    var age = ageParam
    set(value) {
        println("Setter is get called")
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