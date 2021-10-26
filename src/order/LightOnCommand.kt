package order

class LightOnCommand(private val light: Light) : ICommand {

    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}