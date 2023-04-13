/**1.Class,Object,Interface,Function,Constructor,Properties and
 * setter can have modifier[getter has modifier same as property have]
 * 2.by default Modifier is public for all
 * 3.Top Level Declaration-
 *              public   -> accessible from anywhere
 *              internal -> same like public but accessible from same module
 *              protected-> not applicable-protected modifier on top level
 *              private  -> only accessible in the same file
 *
 * 4.Class Member -
 *              public   -> accessible from anywhere [who sees the declaring class can access its public members]
 *              internal -> same like public but accessible from same module [who sees the declaring class can access its internal members]
 *              protected-> only accessible in the same class and its subclass
 *              private  -> only accessible in the same class
 * 5.Local variables, functions, and classes can't have visibility modifiers. its private
 * 6.If you override a protected or an internal member and do not specify the visibility explicitly,
 * the overriding member will also have the same visibility as the original not able to downgrade visibility (N/A - private)
 * 7.we can add more visibility while overriding
 * 8.An outer class does not see private members of its inner classes.*/


internal var toplevelVariable = "topLevelVariable"
open class A{
    private var a = 1
    protected open var b = 2
    internal  var c = 3
    public  var d = 4
}

class B : A(){
    public override var b: Int =10
    fun print(){
        println("$b,$c,$d")

        fun localFun(){
              var l = 12
        }
    }
}