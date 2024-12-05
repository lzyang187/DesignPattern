package command

/**
 * 风扇，有高速、低速模式
 */
class Fan {
    companion object {
        const val HIGH = 2
        const val LOW = 1
        const val OFF = 0
    }

    private var speed = OFF

    fun high() {
        speed = HIGH
        println("风扇开启到高速")
    }

    fun low() {
        speed = LOW
        println("风扇开启到低速")
    }

    fun off() {
        speed = OFF
        println("风扇关闭")
    }

    fun getSpeed(): Int {
        return speed
    }
}