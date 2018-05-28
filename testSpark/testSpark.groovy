@Grab(group = 'com.sparkjava', module = 'spark-core', version = '2.5.5')
@GrabExclude('javax.servlet:javax.servlet-api')
@Grab(group = 'org.slf4j', module = 'slf4j-simple', version = '1.7.21')

import static spark.Spark.*

get '/fib/:number', {req, res ->
    fib(Integer.parseInt(req.params('number')))
}

def fib(num) {
    if(num ==0){
	return 0
    }else if(num == 1){
	return 1
    }else{
	return fib(num-1)+fib(num-2)
    }
}
