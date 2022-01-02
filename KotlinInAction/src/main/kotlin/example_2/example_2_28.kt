package example_2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber28(reader: BufferedReader){
    println("Received ${reader.readLine()}")
    val number = try{
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException){
        println("error :$e")
        println(reader)
        println("${reader.readLine()} is Not a Number")
//        println("in Number : $number")
        return
    }
    println(number)
}

fun main(){
    println(StringReader("not a number"))
    println(BufferedReader(StringReader("not a number")))
    println(BufferedReader(StringReader("not a number")).readLine())
//    println(Integer.parseInt(BufferedReader(StringReader("not a number")).readLine()))
    val reader = BufferedReader(StringReader("not a number"))
    readNumber28(reader)
}
