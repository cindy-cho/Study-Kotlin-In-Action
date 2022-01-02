package example_1

data class Person (val name: String,
                   val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("Mike"),
        Person("Cindy", age = 28))

    val oldest = persons.maxByOrNull{ it.age ?: 0 }
    println("The oldest person is $oldest")
}