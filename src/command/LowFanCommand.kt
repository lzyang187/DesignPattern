package command

class LowFanCommand(private val fan: Fan) : ICommand {

    private var preSpeed = Fan.OFF

    override fun execute() {
        preSpeed = fan.getSpeed()
        fan.low()
    }

    override fun undo() {
        when (preSpeed) {
            Fan.OFF -> fan.off()
            Fan.LOW -> fan.low()
            Fan.HIGH -> fan.high()
        }
    }
}