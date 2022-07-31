fun main(){
    val names = mutableListOf<String>("Pawan", "Rubi","Tej")
    names.forEach{println(it)}
    names.add("Shah")
    println()

    for (n in names) println(n)
    val nameList = mutableSetOf<String>("Pawan","Pawan", "Shah", "Rubi", "Shah", "Tej", "Shah")
    println()
    nameList.forEach { println(it) }
    nameList.add("Anuj")
    nameList.remove("Tej")
    println()
    nameList.forEach { println(it) }
    val students= mutableMapOf<String, Int>(
        "Pawan" to 1,
        "Rubi" to 2,
        "Anuj" to 3,
    )
    students.forEach { println(it) }
    students.forEach { t,u ->
        println("$t relates to $u")}
}