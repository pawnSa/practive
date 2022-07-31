fun main(){
    println("Patter 1")
    var design1=Pattern1(5)
    println("Patter 2")
    println()
    var design2=Pattern2(5)
    println("Patter 3")
    println()
    var design3=Pattern3(5)
    println("Patter 4")
    println()
    var design4=Pattern4(5)
    println("Patter 5")
    println()
    var design5=Pattern5(5)
    println("Patter 6")
    println()
    var design6=Pattern6(5)
    println("Patter 7")
    println()
    var design7=Pattern7(5)
    println("Patter 8")
    println()
    var design8=Pattern8(5)
    println("Patter 9")
    println()
    var design9=Pattern9(5)
    println("Patter 10")
    println()
    var design10=Pattern10(5)
    println("Patter 11")
    println()
    var design11=Pattern11(5)
    println("Patter 12")
    println()
    var design12=Pattern12(5)
    /*var limit =5
    for (i in 0..limit){
        for (j in 0..i){
            print("*")
        }
        println()
    }

     */
}
class Pattern1(var limit1:Int){
    init {
        for(i in 1..limit1){
            for (j in 1..i){
                print("*")
            }
            println()
        }
    }
}
class Pattern2(var limit2:Int){
    init {
        for (i in 1..limit2){
            for (j in 1..limit2){
                print("*")
            }
            println()
        }
    }
}
class Pattern3(var limit3:Int){
    init {
        for (i in 1..limit3){
            for (j in 1..((limit3 - i) + 1)){
                print("*")
            }
            println()
        }
    }
}
class Pattern4(var limit4:Int){
    init {
        for(i in 1..limit4){
            for (j in 1..i){
                print(j)
            }
            println()
        }
    }
}
class Pattern5(var limit5:Int){
    init {
        for (i in 1..limit5){
            for (j in 1..limit5){
                print(j)
            }
            println()
        }
    }
}
class Pattern6(var limit6:Int){
    init {
        for (i in 1..limit6){
            for (j in 1..((limit6 - i) + 1)){
                print(j)
            }
            println()
        }
    }
}

class Pattern7(var limit7:Int){
    init {
        for (i in 1..(2*limit7)){
            if (i<=limit7) {
                for (j in 1..i) {
                    print("*")
                }
            }else{
                for (j in 1..(2*limit7-i)){
                    print("*")
                }
            }
            println()
        }
    }
}

class Pattern8(var limit8:Int){
    init {
        for (i in 1..(2*limit8)){
            if (i<=limit8) {
                for (j in 1..i) {
                    print(j)
                }
            }else{
                for (j in 1..(2*limit8-i)){
                    print(j)
                }
            }
            println()
        }
    }
}
class Pattern9(var limit9:Int){
    init {
        for (i in 1..(limit9)){
            for (k in 1..limit9-i){
                print(" ")
            }
                for (j in 1..i) {
                    print(" * ")
                }
            println()
        }
    }
}
class Pattern10(var limit10:Int){
    init {
        for (i in 1..(limit10)){
            for (k in 1..i){
                print(" ")
            }
            for (j in 1..limit10-i+1) {
                print(" * ")
            }
            println()
        }
    }
}

class Pattern11(var limit11:Int){
    init {
        for (i in 1..(2*limit11)){
            if (i<=limit11) {
                for (k in 1..(limit11-i)){
                    print(" ")
                }
                for (j in 1..i) {
                    print(" * ")
                }
            }else{
                for (k in (limit11+1)..(i)) print(" ")
                for (j in 1..(2*limit11-i)){
                    print(" * ")
                }
            }
            println()
        }
    }
}

class Pattern12(var limit12:Int){
    init {
        for (i in 1..limit12){
            for (l in limit12 downTo i) print(" ")
            for (j in i downTo 1) print("$j")
            for (k in 2..i)print("$k")
            println()
        }
    }
}
