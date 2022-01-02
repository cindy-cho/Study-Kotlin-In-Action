package geometry.shapes
import java.util.Random

fun createRandomRectangle(): Rectangle{
    val random1 = Random().nextInt(100)
    val random2 = Random().nextInt(100)
    println("$random1, $random2")
    return Rectangle(random1, random2)
}

