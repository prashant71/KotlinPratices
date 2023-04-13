class Empty // if class don't have body

class Car { // this class invoke default constructor
    var carname : String = "Beetle" // properties
    fun carDriving() { // methods
        println("$carname Car is driving -> default constructor invoked")
    }
}

class Person constructor(name: String, age: Int) { // parameters
        //by passing param add custom salutation before properties created
        val name = "Mr. $name" // when we define variable by var and val then it will create properties for class
        var age : Int
        val canVote = age > 18
        init {
            this.age = age
        }
 }

    fun main() {
        //Default constructor
        val car = Car()
        car.carDriving()

        //primary constructor get called which is look like function declration it has properties inside ()
        var dumper = Vehicle("Benz", "Dumper",4)
        println("Name: ${dumper.name}, Type : ${dumper.type},Capacity :${dumper.capacity}")

        var jcb = Vehicle("JCB","escort")
        println("Name: ${jcb.name}, Type : ${jcb.type},Capacity :${jcb.capacity}")

        var p1 = Person("Alex",34)
        println("Name: ${p1.name}")
        println("Age: ${p1.age}")
    }

