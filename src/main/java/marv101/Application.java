package marv101;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class Application {       

	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

	public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
    }   
   
}