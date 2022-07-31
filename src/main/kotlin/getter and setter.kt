fun main(){
    var addHobby= HumanHobbies()
    addHobby.getHobbies("Cricket")
    addHobby.getHobbies("Football")
    println(addHobby.hobbies)
}

class HumanHobbies{
    private val _hobbies= mutableListOf<String>()
    val hobbies:List<String>
    get()=_hobbies
    fun getHobbies(hobby:String){
        _hobbies.add(hobby)
    }
}
enum class Suburb{
    HOMEBUSHWEST,
    STRATHFIELD,
    KIDCOMBE,
    
}