package com.study.demo1

import java.util.function.Consumer

open class Fruit
{

    open val name: String = "aaa"
    val size :Int =100


}


class Apple:Fruit()
{

    override val name:String ="bbb"


}




fun main(args: Array<String>) {


    var fruit =  Fruit ();

    println(fruit.name)
    println(fruit.size)


   var a5:Int =12


    val a=1

    println()

    val m = intArrayOf(1,2,3)

    m.set(0, 4)

    println(m)



    for( i in m)
    {
        println(i)
    }

    var a1 = 100
    var b = 20

    var max = if (a1 > b) {
        println("a1>b");a1
    } else {
        b
    }


    var min = if(a1<b) a1 else b

    println(max)

    println (min)

}