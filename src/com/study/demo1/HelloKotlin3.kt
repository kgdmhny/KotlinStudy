package com.study.demo1

fun convert2Int(str: String) :Int?
{
    try {
        return str.toInt();
    }catch (ex:NumberFormatException)
    {
        return  null;
    }
}


fun printMultiply(a:String ,b:String )
{
    var int1 = convert2Int(a)

    var int2 = convert2Int(b)

    //println(int1!! * int2!!)

    //println(int1*int2)
}


fun main(args: Array<String>) {
    printMultiply("30","123b")
}

