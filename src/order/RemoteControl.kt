package order

/**
 * 发起请求的类：遥控器
 */
class RemoteControl {

    companion object {
        // 遥控器总插槽是7个
        const val SIZE = 7
    }

    private val onCommands = mutableListOf<ICommand>()
    private val offCommands = mutableListOf<ICommand>()
    private var undoCommand: ICommand = NoCommand()

    init {
        // 开始时遥控器插槽为空
        for (i in 0..7) {
            onCommands.add(i, NoCommand())
            offCommands.add(i, NoCommand())
        }
    }

    fun setCommand(index: Int, onCommand: ICommand, offCommand: ICommand) {
        onCommands.add(index, onCommand)
        offCommands.add(index, offCommand)
    }

    fun onClicked(index: Int) {
        undoCommand = onCommands[index]
        onCommands[index].execute()
    }

    fun offClicked(index: Int) {
        undoCommand = offCommands[index]
        offCommands[index].execute()
    }

    fun undo() {
        undoCommand.undo()
    }

}