package command

class FanOffCommand(private val fan: Fan) : ICommand {

    private var preSpeed = Fan.OFF

    override fun execute() {
        preSpeed = fan.getSpeed()
        fan.off()
    }

    override fun undo() {
        when (preSpeed) {
            Fan.OFF -> fan.off()
            Fan.LOW -> fan.low()
            Fan.HIGH -> fan.high()
        }
    }
}