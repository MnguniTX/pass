package testing.demo.apicontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTFul web service
@RestController
//Map web requests to spring controller methods
@RequestMapping("/Methods")
public class Entrypoint {
	
	@GetMapping("/hey")
	public String test()
	{
		return "Hello World";
	}

}
