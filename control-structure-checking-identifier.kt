/* Implement the function that checks whether a string is a valid identifier.
A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.*/

fun isValidIdentifier(s: String): Boolean {
    when {
       "[^0-9a-z_]".toRegex().containsMatchIn(s) || s.isNullOrEmpty() -> return false 
       "[a-z_]".toRegex().containsMatchIn(s[0].toString()) -> return true
       else -> return false
    }
}


fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
