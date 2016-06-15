

class BootStrap {

    def dataImporterService

    def init = { servletContext ->
        dataImporterService.doImportData()
    }

    def destroy = {
    }
}
