import geometry.color.Color
import geometry.color.Color.*

fun mixOptimized(c1 : Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == RED)
        -> ORANGE
        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW)
        -> GREEN
        ( c1 == BLUE && c2 == VIOLOET) ||
                (c1 == VIOLOET && c2 == BLUE)
        -> INDIGO
        else -> throw Exception("Dirty Color")
    }

fun main(){
    println(mixOptimized(BLUE,YELLOW))
}