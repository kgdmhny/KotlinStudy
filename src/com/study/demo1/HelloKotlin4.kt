package com.study.demo1

/**
 *
 *
 * @Author: wub
 * @Author:
 * @Date: Created in 2020/4/23 21:03
 */

class Demo4{

     var name:String



    init {
        this.name="helloworld"
    }
    fun init() {
        println("init.....")

        this.name ="hello"
    }


    fun print() {

        println(this.name)

    }

}


fun main(args: Array<String>) {

    var demo5 = Demo4()

   // demo5.name

  //  demo5.init()

    demo5.print()
}