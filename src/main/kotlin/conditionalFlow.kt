package org.example
import java.util.Scanner
fun main(){

  val reader=Scanner(System.`in`)
    println("Please enter your age")
    val age:Int=reader.nextInt()
    if(age>=18) print("you  can vote")
    else print("you can not vote")
}