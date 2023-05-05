package kotlinAssignment

fun isValidIdentifier(s: String) {

    val isValid = if(s.isEmpty()){
        false
    }else if(!s.matches("^[a-zA-Z0-9_]*$".toRegex())){
        false
    }else !s[0].isDigit()

    println(isValid)

}

fun main() {
    isValidIdentifier("name")  // true
    isValidIdentifier("_name")  // true
    isValidIdentifier("_12")    // true
    isValidIdentifier("")       // false
    isValidIdentifier("012")    // false
    isValidIdentifier("no$")    // false
}