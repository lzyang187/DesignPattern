package command

class LightOffCommand(private val light: Light) : ICommand {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }

}