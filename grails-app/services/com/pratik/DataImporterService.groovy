package com.pratik

import groovy.json.JsonSlurper

class DataImporterService {

    public doImportData(){
        def inputFile = new File("persons.json")
        def inputJson = new JsonSlurper().parseText(inputFile.text)
        inputJson.each{
            new Person(name: it.get(0), age: Integer.parseInt(it.get(1).toString()), address: it.get(2)).save()
        }
    }
}
