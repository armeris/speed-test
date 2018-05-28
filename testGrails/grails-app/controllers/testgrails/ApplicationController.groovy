package testgrails

import grails.core.GrailsApplication
import grails.util.Environment
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        render text: fib(params.int('num'))
    }

    def fib(num){
	if(num==0){
	    return 0
	}else if(num==1){
	    return 1
	}else{
	    return fib(num-1)+fib(num-2)
	}
    }
}
