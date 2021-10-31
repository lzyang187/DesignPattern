package state

fun main() {
    val machine = GumballMachine(5)
    machine.backMoney()
    machine.dispense()
    machine.insertMoney()
    machine.backMoney()
    for (i in 0..5) {
        machine.insertMoney()
        machine.dispense()
    }
}