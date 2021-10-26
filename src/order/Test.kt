import order.*

fun main() {
    val light = Light("客厅灯")
    val lightOnCommand = LightOnCommand(light)
    val fan = Fan()
    val lowFanCommand = LowFanCommand(fan)
    val highFanCommand = HighFanCommand(fan)

    val lightOffCommand = LightOffCommand(light)
    val fanOffCommand = FanOffCommand(fan)

    val partyOnCommand = PartyOnCommand(light, fan)
    val partyOffCommand = PartyOffCommand(light, fan)

    val control = RemoteControl()
    control.setCommand(0, lightOnCommand, lightOffCommand)
    control.setCommand(1, lowFanCommand, fanOffCommand)
    control.setCommand(2, highFanCommand, fanOffCommand)
    control.setCommand(3, partyOnCommand, partyOffCommand)

    control.onClicked(0)
    control.onClicked(1)
    control.offClicked(0)
    control.undo()
    control.onClicked(2)
    control.undo()
    control.onClicked(3)
    control.undo()
}