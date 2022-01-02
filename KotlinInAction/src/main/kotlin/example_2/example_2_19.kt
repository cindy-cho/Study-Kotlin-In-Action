package example_2

fun upgradeEval(e: Expr) : Int =
    if (e is Num) {
        e.value
    } else if(e is Sum){
        eval(e.right) + eval(e.left)
    }else {
        throw IllegalArgumentException("Unknown expression")
    }


fun main(){
    println(upgradeEval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(upgradeEval(Sum(Num(1),Num(4))))
}