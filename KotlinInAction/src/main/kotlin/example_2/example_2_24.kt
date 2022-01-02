package example_2

import java.util.*

fun main(){
    val binaryReps = TreeMap<Char, String>()
    for ( c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.code) // toInt() -> code ??
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps){
        println("$letter = $binary")
    }
}