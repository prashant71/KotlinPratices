fun main(){
    var a : Int = 1
    var b : Float = 2.3f
    var c : Double = 3.32
    var d : Long = 52

    /** Arithmetic Operators */
    println( a + b)
    println( a - b)
    println( c * d)
    println( a/b) // anyone variable is float result is into Float

    /** Relational Operators */
    println(a<b)
    println(a>b)
    println(a==b.toInt())
    println(a.toFloat()!=b)

       /** Logical Operators && || and ! */

    var condition1 = a>b
    //Short Circuiting --> if 1st condition meet(false/true) then skip 2nd condition
    /** &&
     * T && T = T
     * T && F = F
     * if 1st condition false then skip 2nd condition
     * F && T = F
     * F && F = F*/
    println(a<b && b>c)

    /** ||
     * if 1st condition true then skip 2nd condition
     * T && T = T
     * T && F = T
     * F && T = T
     * F && F = F*/
    println(a==1 && d++==1L)
    println("condition1:$condition1 negate of condition1:${!condition1}")

    /** Post and Pre Increment or Decrement */
    println(a++)
    println(++a)
    println(--b)
    println(b--)

    //arithmetic and immediate assignment
    a+=2
    println(a)
    b-=1.2f
    println(b)
    c*=2
    println(c)

}