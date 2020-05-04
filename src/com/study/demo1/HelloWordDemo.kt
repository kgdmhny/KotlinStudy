package com.study.demo1

import com.study.demo2.sum
import com.study.demo2.sum2
import java.util.function.Consumer


fun main(args: Array<String>) {


    val list: List<String> = listOf("hello","world","hello world");

    for(str in list)
    {
        println(str)

    }

    println("-------------")

    list.forEach (
        Consumer{ println(it)}

    )

    println("-------------")

    list.forEach(System.out::println)


    println(sum(10,20))
    println(sum2(10,20))
}

