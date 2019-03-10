package testing.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTFul web service
@RestController
//Map web requests to spring controller methods

public class Entrypoint {
	
	@RequestMapping("/Methods")
	public String test()
	{
		return "Hello World";
	}

}
