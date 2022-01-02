import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader): Int?{
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException){ // NumberFormatException은 체크예외가 아니다. 그래서 자바 컴파일러는 강제하지 않는다
        return null
    }
    finally {
        reader.close()
        /*
        BufferedReader.close 는 IOException을 던질수 있는데, 해당 예외는 체크 예외이므로 자바에서는 반드시 처리야 한다. */
    }
}

fun main(){
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}