package com.pratik

class AwesomeMailSenderService {

    def mailService
    def groovyPageRenderer

    public sendRegularMail(){
        doSomethingReallyTimeConsuming()
        String content = groovyPageRenderer.render(view: '/home/email', model: [persons: Person.list()])
        mailService.sendMail {
            to "pratik.kayastha@compareinsurance.com.au"
            from "Pratik <pratik.kayastha@pratik.com>"
            subject "This is a normal mail"
            html(content)
        }
        println "--SENDING NORMAL MAIL COMPLETED..."
    }

    public sendAsyncMail(){
        List<Person> personList = Person.list()
        runAsync{
            doSomethingReallyTimeConsuming()
            String content = groovyPageRenderer.render(view: '/home/email', model: [persons: personList])
            mailService.sendMail {
                to "pratik.kayastha@compareinsurance.com.au"
                from "Pratik <pratik.kayastha@pratik.com>"
                subject "This is an async mail"
                html(content)
            }
            println "--SENDING ASYNC MAIL COMPLETED..."
        }
    }

    public sendAsyncMail(boolean checkGorm){
        runAsync{
            println "-DOING TIME CONSUMING THING..."
            doSomethingReallyTimeConsuming()
            println "-GETTING PERSONS"
            List<Person> personList = Person.list()
            println "--PERSONS:: ${personList}"
            String content = groovyPageRenderer.render(view: '/home/email', model: [persons: personList])
            mailService.sendMail {
                to "pratik.kayastha@compareinsurance.com.au"
                from "Pratik <pratik.kayastha@pratik.com>"
                subject "This is an async mail"
                html(content)
            }
            println "--SENDING ASYNC MAIL COMPLETED..."
        }
    }

    private void doSomethingReallyTimeConsuming(){
        sleep(5000)
    }

}
