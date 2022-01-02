//fun example_2.main(args: Array<String>){
//    val name = if (args.size >0) args[0] else "Kotlin"
//    println("Hello, $name!")
//}

//fun example_2.main(args: Array<String>){
//    if( args.size >0){
//        println("Hello, ${args[0]}!")
//    }
//}

fun main(args: Array<String>){
    println("Hello, ${if (args.size >0) args[0] else "someone"}!")
}