fun main(){
    var listOfAnimal= mutableListOf<Animal>(
            Animal("Lucky"),
            Animal("Pihu",12,"cat"),
            Animal("Lucy",10,"dog","Pawan"),
            Animal("hero",15,"Cat","Rubi"),
    )
    var x = listOfAnimal[1].name
    println(x)
    for (l in listOfAnimal.indices){
      println("${listOfAnimal[l].animalOwner} is the owner of ${listOfAnimal[l].name} ${listOfAnimal[l].animalType} which is ${listOfAnimal[l].animalAge} years old")
    }
   // println("${listOfAnimal[3].animalOwner} is the owner of ${listOfAnimal[3].name}  ${listOfAnimal[3].animalType} which is ${listOfAnimal[3].animalAge} years old")


}

class Animal(var name:String){
    var animalAge:Int=0
    var animalType:String=""
    var animalOwner:String=""
    //init {
    //    println("The name of the animal is $name")
    //}
    constructor(animalName:String,animalAge: Int):this(animalName){
        this.animalAge=animalAge
    }
    constructor(animalName: String,animalAge:Int,animalType:String):this(animalName,animalAge){
        this.animalType=animalType
    }
    constructor(animalName: String,animalAge: Int,animalType: String,animalOwner:String):this(animalName,animalAge,animalType){
        this.animalOwner=animalOwner
    }
}