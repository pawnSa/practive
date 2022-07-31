fun main () {
    val t = Thermometer()
    t.celsius = 43.5
    println(t.celsius)
    println(t.fahrenheit)
    t.fahrenheit = 85.0
    println(t.fahrenheit)
    println(t.celsius)
}
class Thermometer {
    private var _celsius: Double = 0.0
    var celsius: Double
        get() {
            return this._celsius
        }
        set(value: Double) {
            this._celsius = value
        }
    var fahrenheit: Double
        get() {
            return (this._celsius * 9 / 5) + 32
        }
        set(value: Double) {
            this._celsius = (value - 32) * 5 / 9
        }
}

