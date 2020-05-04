package com.study.demo1

private class MyClass (var username: String){

    //private var username :String="" ;

    private var age :Int=0;

    init {
        println("username= $username")
        this.username = username;
       // this.age = age;
    }


    constructor(username:String,age:Int) : this("66666") {
        this.username = username;
        this.age = age;
    }
    fun showNameAndAge()
    {

        println("name = $username, age = $age")
    }


}

fun main(args: Array<String>) {
    val myClass = MyClass("wubei",28);


    myClass.showNameAndAge();
}


