package example_2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber29(reader: BufferedReader){
    val number = try{
        Integer.parseInt(reader.readLine())
    } catch( e: NumberFormatException){
        null
    }
    println(number)
}

fun main(){
    val reader = BufferedReader(StringReader("not a number"))
    println("Before function : ${reader.readLine()}")
    readNumber29(reader)
    println("After function : ${reader.readLine()}")
}
