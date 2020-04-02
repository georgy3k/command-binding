package command

import grails.validation.Validateable

@Validateable
class TestBindCommand {

    String fieldType
    def fieldValue
}