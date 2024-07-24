

fun main(){

    val row = 3
    val col = 3

    val arr = Array(row) {Array(col) {0} }

    for (i in 0..row){
        for (j in 0..col){
            val input = readLine()?.toIntOrNull() ?: 0
            arr[i][j] = input
        }
    }
    for (i in 0..row){
        for (j in 0..col){
            println("${arr[i][j]} ")

        }
        println()
    }
}