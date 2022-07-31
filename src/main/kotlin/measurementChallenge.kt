fun main(){
    var inchEq = Measurement()
    inchEq.inches=500.0

}
class Measurement{
    private var _centimeter : Double=0.0
    var centimeter : Double
        get() = field//this._centimeter
        set(value) {
            field= this._centimeter
        }
    var inches:Double
        get() = field//this._centimeter/2.54
        set(value) {
            field= value/2.54
            println("The inches equivalent of $value is $field")
    }
}