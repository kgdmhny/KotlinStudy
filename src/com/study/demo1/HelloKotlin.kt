package com.study.demo1

fun teacher( a: Int, b:Int,person: Person) {

  //   a =123;


    var c=12345;

    //
    //nmmmjh
    //


    var you="you";
    var a =245;
    var b=b;

    person.name="123";
    println("$a+$b = ${a+b},Peson.name =${person.name} ,c=${c}")

    fun main(args: Array<String>) {
        println("hello,XXXXX")
    }

}

fun main(args: Array<String>) {



    var person:Person = Person("lili");

    person.say()

     teacher(78 ,32,person)


}



open class Person constructor( var name:String)
{


    constructor(name: String, age:Int):this(name)
    {

    }


    init {
       println(name)

    }

    fun say()
    {
        println("hello")
    }
}


class Teacher : Person {

    constructor(name: String) : super(name) {

    }




}