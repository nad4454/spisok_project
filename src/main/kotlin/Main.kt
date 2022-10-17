fun main() {
    var list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    list.forEach(::get)
}

fun get(value: Int){
    print(value)
}