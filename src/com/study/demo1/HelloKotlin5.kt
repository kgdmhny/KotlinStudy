package com.study.demo1

/**
 *
 *
 * @Author: wub
 * @Author:
 * @Date: Created in 2020/4/23 21:53
 */

open class Demo5{


    private var name = "zhangsan"

    protected var age =  30


    internal var address="beijing"


}

class Demo51 : Demo5() {

    fun print() {


        println(this.age)

        println(this.address)



    }
}

class Demo52{


    var demo = Demo5();

    fun print()
    {
        demo.address
    }
}