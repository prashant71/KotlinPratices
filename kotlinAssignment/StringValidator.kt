package kotlinAssignment

fun isValidIdentifier(s: String): Boolean {

    val isValid = if(s.isEmpty()){
        false
    }else if(!s.matches("^[a-zA-Z0-9_]*$".toRegex())){
        false
    }else !s[0].isDigit()

    return isValid

}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}