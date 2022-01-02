import geometry.color.Color
import geometry.color.Color.*

fun mix(c1: Color, c2: Color) =
    when (setOf(c1,c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLOET) -> INDIGO
        else -> throw Exception("Dirty Color")
    }

fun main(){
    println(mix(BLUE, YELLOW))
}

/*
불필요한 set 인스턴스를 여럿 생성한다
만일 이 함수가 자주 호출된다면 불필요한 가비지 객체가 늘어난다
-> 이걸 업그레이드 한게 2_16 예제
*/