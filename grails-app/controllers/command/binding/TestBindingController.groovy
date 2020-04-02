package command.binding

import command.TestBindCommand

class TestBindingController {

    def index() { }

    def testBinding(TestBindCommand testBindCommand) {
        println("fieldType: " + testBindCommand.fieldType)
        println("fieldValue: " + testBindCommand.fieldValue)
        render("fieldType: ${testBindCommand.fieldType} - fieldValue: ${testBindCommand.fieldValue}")
    }
}
