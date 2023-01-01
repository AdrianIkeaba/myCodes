fun linearSearch(arr: Array<Int>, key: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == key) {
            return i
        }
    }
    return -1
}
fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val key = 3
    val index = linearSearch(arr, key)
    println("Key $key found at index $index")
}