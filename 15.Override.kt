open class Parent1{

    open var name : String = ""
    var education : String = ""

    constructor(nameParam : String,eduParam : String){
        this.name = nameParam
        education = eduParam
        println("constructor called")
    }

    constructor():this("default name","default edu CDS")

    open fun getFamilyDetails(){
        println("Parent1 Details is -> $name, $education")
    }

    override fun toString(): String {
        return " toString fun ->$name, $education"
    }
}
/** If the derived class has no primary constructor, then each secondary constructor has to initialize the base type
 * using the super keyword or it has to delegate to another constructor which does.
 * Note that in this case different secondary constructors can call different constructors of the base type:*/



open class Child1 : Parent1{
    open val grandsonage : Int = 0
    override var name : String = "C"
    constructor(nameParam: String,eduParam: String){
        this.name = nameParam
    }
    constructor() : this("cc","ca")
    final override fun getFamilyDetails() {
        /* Access parent methods by using super keyword*/
        super.getFamilyDetails()
        println("Access parent properties by using super keyword ${super.name}")
        println("Child Details is -> $name $education")
    }
}

/** A member marked override is itself open, so it may be overridden in subclasses.
 * If you want to prohibit re-overriding, use final:*/
class GrandChild: Child1 {
    override var grandsonage: Int = 10 //You can also override a val property with a var property,
                                    // but not vice versa. This is allowed because a val property essentially declares a get method,
                                    // and overriding it as a var additionally declares a set method in the derived class.
    constructor():super("GC","LKG")

   /* override fun getFamilyDetails() {
        super.getFamilyDetails()
        println("Grand child details")
    }*/

}
fun main(){
//  var p1 = Parent1("ASZ","B.E",3)
//      p1.getFamilyDetails()
//      println(p1.toString())
//
//  var c1 = Child1("WWE","Bcom",0)
//      c1.getFamilyDetails()
//     GrandChild().getFamilyDetails()
    var grand = GrandChild()
    grand.getFamilyDetails()
}
