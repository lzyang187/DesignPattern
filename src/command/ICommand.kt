package command

/**
 * 命令模式：将发出请求的对象和执行请求的对象通过此接口进行解耦
 */
interface ICommand {
    fun execute()
    fun undo()
}