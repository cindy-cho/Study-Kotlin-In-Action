import geometry.color.Color
import geometry.color.Color.*

fun getWarmth2(color : Color) = when(color){
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLOET -> "cold"
}

fun main(){
    println(getWarmth2(BLUE))
}