import java.util.Arrays
import kotlin.math.min

fun lab1(num1: Int, num2: Int) : ArrayList<Int>{
    var array = ArrayList<Int>()
    val min: Int
    val max: Int
    if (num1 < num2){
        min = num1
        max = num2
    }
    else{
        min = num2
        max = num1
    }
    for (i in min .. max)
        array.add(i)
    return array
}

fun lab2(){
    var array = ArrayList<Int>()
    array.addAll(arrayListOf(8, 21, 5, 90, 11, 0))
    array.add(0, 90)
    array.removeAt(4)
    array.add(-35)
    println(array.toString().replace("[", "").replace("]",""))
}

fun lab3(arr: String): ArrayList<Int>{
    val arr1 = ArrayList<Int>(arr.split(", ").map { x -> x.toInt() })
    println("max = ${arr1.max()}")
    println("min = ${arr1.min()}")
    return arr1
}

fun lab4(arr: ArrayList<Int>){
    val array = arr.distinct() as ArrayList<Int>
    array.remove(array.min())
    println(array.min())
}

fun lab5(arr: ArrayList<Int>){
    arr.sort()
    println(arr.toString().replace("[", "").replace("]",""))
}

fun lab6(arr: ArrayList<Int>){
    var average: Int = 0
    for(i in arr)
        average+=i
    average/=arr.size
    println(average)
    println(arr.filter { x -> x > average }.toString().replace("[", "").replace("]",""))
}

fun main() {
    println("Введите 2 числа:")
    val num1 = readln()
    val num2 = readln()
    println(lab1(num1.toInt(), num2.toInt()).toString()
        .replace("[", "").replace("]",""))
    println()

    lab2()
    println()

    var arr1 = readln()
    var arr2 = lab3(arr1)
    println()

    lab4(arr2)
    println()

    lab5(arr2)
    println()

    lab6(arr2)
    println()
}