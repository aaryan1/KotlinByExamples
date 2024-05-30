package org.example

fun main(){
    //sortAnArrayInbuiltFunction()
    //sortArrayUsingCustomComparator()
    listOperations()

}
fun sortAnArrayInbuiltFunction(){
    pe("Sorting with sort function")
    val ages= arrayOf(34,56,78,34,67,89,2,5,7)
    ages.sort()
    println(ages.joinToString(", "))
}

fun sortArrayUsingCustomComparator(){
    pe("Sorting with sortWith function")
    val ages= arrayOf(34,56,78,45,79,23)
    ages.sortWith(compareByDescending { it })
    println(ages.joinToString(", "))
}

fun listOperations(){
    p("List operations")
    val mList= mutableListOf<Int>(34,5,6,7,8,5,34,5,6,7,8)
    pe("Print the list items using loops")
    mList.forEach { p(it.toString()) }
    mList.sort()
    pe("sorted list")
    p(mList.joinToString(","))
    pe("filter list for even numbers ")
    p(mList.filter{ it%2==0 }.toString())
    pe("Print a sublist")
    val sublist=mList.subList(0,3)
    p(sublist.toString())

}
fun p(string:String){
    println(string)
}
fun pe(string:String){
    println(string.addExclamations())
}
fun String.addExclamations():String{
    return "$this!!"
}