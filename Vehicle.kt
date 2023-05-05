
/**
 * this is treat as primary constructor
 *
 * The constructor keyword can be omitted if there is no annotations or access modifiers specified (looo@ or private,internal)
 *
 * we can pass default value to constructor*/

class Vehicle constructor(val name: String,val type:String,capacity:Int=2) {
    /** property created when we define as var and val still then it is like parameter not able to accessible outside */
    var capacity = capacity

    /** init block is used to initialize something before constructor get called
     *
    we can write multiple init blocks which can get execute sequential top 2 down */
    init {
        println("1st init blocked get called")
    }

    init {
        println("2nd init blocked get called")
    }

    constructor(name: String, type: String) : this(name, type, 6){
        println("secondary constructor called - double param")
    }

    constructor(name: String):this(name,"Vehicle"){
        println("secondary constructor called - single param")
    }
}