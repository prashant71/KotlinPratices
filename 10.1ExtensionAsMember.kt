open class Base{
    public  var f =10
}

class Derived : Base(){}

open class BaseCaller{
    open fun Base.printFunction(){
        println("Basecaller -> Base ext pritnfunction {$f}")
    }

    open fun Derived.printFunction(){
        println("Basecaller -> Derived ext pritnfunction")
    }
    fun call(s : Base){
        s.printFunction()
    }
}

class DerivedCaller : BaseCaller(){
    override fun Base.printFunction(){
         println("DerivedCaller -> Base ext printfunction")
    }

    override fun Derived.printFunction(){
        println("DerivedCaller -> Derived ext printfuncion")
    }

}

fun main(){
   BaseCaller().call(Base())
   BaseCaller().call(Derived())

   DerivedCaller().call(Base()) //- dispatch receiver is resolved virtually
   DerivedCaller().call(Derived()) //- extension receiver is resolved statically

}