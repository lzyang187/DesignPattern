package order

/**
 * 组合命令，开启一组命令
 */
class PartyOnCommand(private val light: Light, private val fan: Fan) : ICommand {

    override fun execute() {
        light.on()
        fan.low()
    }

    override fun undo() {
        light.off()
        fan.off()
    }
}