package command

/**
 * 执行请求的对象：灯
 */
class Light(private val name: String) {

    fun on() {
        println("开启${name}的电灯")
    }

    fun off() {
        println("关闭${name}的电灯")
    }
}