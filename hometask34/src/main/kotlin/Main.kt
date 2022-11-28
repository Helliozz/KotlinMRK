fun main() {
    println(changer())
    println(ave())
}

/**
 * 1) Поменять максимальный и минимальный элемент в котлиновской коллекции
 */
fun changer(): ArrayList<Int> {
    val arr: ArrayList<Int> = arrayListOf()
    var max=0
    var min=0
    println("Enter size")
    val size = readLine()?.toIntOrNull()
    for(i in 0 until size!!){
        arr.add((0..100).random())
        if(arr[i]>arr[max]) max=i
        if(arr[i]<arr[min]) min=i
    }
    println(arr)
    val a = arr[max]
    arr[max]=arr[min]
    arr[min]=a
    return arr
}

/**
 * 2) заменить все значения массива на среднее арифметическое его элементов (использовать ArrayList)
 */
fun ave(): ArrayList<Int> {
    val arr: ArrayList<Int> = arrayListOf()
    println("Enter size")
    val size = readLine()?.toIntOrNull()
    for(i in 0 until size!!) arr.add((0..100).random())
    println(arr)
    val ave=arr.average().toInt()
    for(i in 0 until size) arr[i]=ave
    return arr

}