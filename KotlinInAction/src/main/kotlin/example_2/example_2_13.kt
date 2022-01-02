import geometry.color.Color

fun getWarmth(color: Color) = when(color){
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLOET -> "cold"
}

fun main(){
    println(getWarmth(Color.ORANGE))
}