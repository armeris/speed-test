package testmn;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class FibController {
    @Get("/fib/{number}")
    public Long fibbonacci(Integer number) {
	return fib(number);
    }

    private Long fib(Integer num) {
	if(num == 0) {
	    return 0L;
	}else if (num == 1) {
	    return 1L;
	}else{
	    return fib(num-1)+fib(num-2);
	}
    }
}
