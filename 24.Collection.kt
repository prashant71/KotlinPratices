fun main(){

    //List and MutableList
    var list = listOf<Int>(1,6,5,4,6,5)
    println(list.toString())
    println(list.indexOfFirst{it==5})
    println(list[2])
    println(list.size)

    val mutList = mutableListOf<Int>(11,51,87,1,65,33)
    mutList.addAll(list)
    println(mutList.toString())
    mutList.reverse()
    mutList.removeAt(2)
    mutList.remove(11)
    mutList.add(125)
    println(mutList.contains(51))
    println(mutList.toString())
    println(mutList.getOrNull(10))
    println(mutList.getOrElse(12) { it })

    //Map and MutuableMap
    val map = mutableMapOf<Int,String>()
    map.put(1,"Snehal")
    map.put(3,"Koli")
    map.put(2,"Prashant")

    println(map.get(1))

    map[4]="pillu"
    println(map[4])

    val map2 = mapOf<String,Int>("One" to 1,"Two" to 2, "Three" to 3)
    for ((k,v) in map2){
        println("$k = $v")
    }

    println(map2 + Pair("Five", 5))
    println(map2 + mapOf("Six" to 6, "Seven" to 7))

    println(map2 - "One")
    println(map2 - listOf("one","Three"))

    //setof

    var set = setOf<Int>(1,5,4,2,3,6,)
    println(set union setOf(5,7,2,8,))
    println(set intersect setOf(1,5))

    //Hashmap
    var hashmap = HashMap<Int,List<String>>()
    hashmap.put(1, listOf("one","two","three"))
    hashmap.put(5, listOf("5one","5two","5three"))
    hashmap.put(4, listOf("4one","4two","4three"))
    hashmap.put(2, listOf("2one","2two","2three"))

    hashmap.toSortedMap()

    println(hashmap.get(2)?.get(2))
    hashmap.forEach { t, u -> println(u)  }

}