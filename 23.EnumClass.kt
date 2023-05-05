
interface Print{
    fun currentDay()
}
/**set of variable used for application
 Each enum constant is an object*/

enum class DAYS(var pos : Int) : Print{
    SUNDAY(1) {
        override fun currentDay() {
            println("current day - Today is $this")
        }
    },
    MONDAY(2){
        override fun currentDay() {
            println("Today is $this")
        }
    },
    TUESDAY(3){
        override fun currentDay() {
            println("Today is $this")
        }
    },
    WEDNSDAY(4){
        override fun currentDay() {
            println("Today is $this")
        }
    },
    YHRUSDAY(5){
        override fun currentDay() {
            println("Today is $this")
        }
    },
    FRIDAY(6){
        override fun currentDay() {
            println("Today is $this")
        }
    },
    SATUREDAY(7){
        override fun currentDay() {
            println("Today is $this")
        }
    };

    fun printAllDays(){
           for (day in DAYS.values()){
               println(day)
           }
    }
}

fun main(){
    //enum constatnt are object of enum class
    val day : DAYS = DAYS.SUNDAY
    println(day)
    println(DAYS.MONDAY.pos)
    day.printAllDays()
    day.currentDay()

    //enum object has 2 properties ordinal and name
    println(DAYS.WEDNSDAY.ordinal)
    println(DAYS.MONDAY.name)

    //DAYS.values()

}