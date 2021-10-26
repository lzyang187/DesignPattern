package order

/**
 * 组合命令，开启一组命令
 */
class PartyOffCommand(private val light: Light, private val fan: Fan) : ICommand {

    override fun execute() {
        light.off()
        fan.off()
    }

    override fun undo() {
        light.on()
        fan.low()
    }
}