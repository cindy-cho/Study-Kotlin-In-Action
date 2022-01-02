package example_2

fun upgradeWhenEval (e: Expr) : Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }


fun main(){
    println(upgradeWhenEval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(upgradeWhenEval(Sum(Num(1),Num(4))))
}