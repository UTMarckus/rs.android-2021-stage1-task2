package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String = a.filter { b.contains(it.toUpperCase()) }.let {
        if (it.toUpperCase() == b) "YES" else "NO"
    }
}
