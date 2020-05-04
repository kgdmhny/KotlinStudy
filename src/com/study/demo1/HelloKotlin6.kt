package com.study.demo1

fun main(args: Array<String>) {

    var array: IntArray = intArrayOf(1, 3, 4)


    for (item in array) {
        println(item)
    }


    for (i in array.indices) {

        println("array[$i] = ${array[i]}")
    }

    for ((index, value) in array.withIndex()) {
        println("array[$index]= $value")
    }

    println(myPrintWhen("hello"))


    for ( i in 2..10) {
        println(i)
    }

    println("-------------------")
    for ( i in 2..10 step 3) {
        println(i)
    }

    println("-------------------")
    for (i in 2.rangeTo(10)) {
        println(i)
    }

    println("-------------------")
    for (i in 10 downTo 2 step 2) {
        println(i)
    }



}


fun myPrintWhen(str: String) :String {

   return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else ->"Other input"
    }
}