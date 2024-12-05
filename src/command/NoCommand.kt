package command

/**
 * 空对象：不想返回一个有意义的对象时，空对象就可以派上用场了，客户也可以将处理null的责任转移给空对象
 */
class NoCommand : ICommand {
    override fun execute() {
        println("execute什么也不做")
    }

    override fun undo() {
        println("undo什么也不做")
    }
}