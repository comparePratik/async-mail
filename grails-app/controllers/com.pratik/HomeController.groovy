package com.pratik

class HomeController {

    def awesomeMailSenderService
    def dataImporterService

    def index() {
        println "--HERE IN INDEX ACTION OF HOME CONTROLLER ..."
    }

    def sendNormalMail(){
        println "--SENDING NORMAL MAIL..."
        awesomeMailSenderService.sendRegularMail()
        List<Person> allPersons = Person.list()

        render view:'mailResult', model: [dateToken : System.currentTimeMillis(), message: 'Normal Mail', persons: allPersons]
    }

    def sendAsyncMail(){
        println "--SENDING ASYNC MAIL..."
        awesomeMailSenderService.sendAsyncMail(true)
//        awesomeMailSenderService.sendAsyncMail()
        List<Person> allPersons = Person.list()

        render view:'mailResult', model: [dateToken : System.currentTimeMillis(), message: 'Async Mail', persons: allPersons]
    }

    def doImport(){
        println "Importing ..."
        dataImporterService.doImportData()

        redirect uri:'/'
    }

    def checkPerson(){
        [persons: Person.list()]
    }

}
