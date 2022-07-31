fun main(){
    var student1= StudentInfo("Pawan")
    var student2=StudentInfo("Rubi", 29)
    var student3=StudentInfo("Tej", 24,"Homebush West")
    println("${student2.age}")
    println("Student ${student2.name} is ${student2.age} years old")
    println("Student ${student3.name} is ${student3.age} years old and lives in ${student3.suburb}")


}

class StudentInfo(var name:String){
    var age:Int=0
    init{
        println("The student name is $name")
    }
    constructor(studentName:String, age:Int):this(studentName){
        this.age=age
    }
    var suburb:String=""
    constructor(studentName: String,age: Int,suburb:String):this(studentName,age){
        this.suburb=suburb

    }
}