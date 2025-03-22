package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app") 

public class Student {
	@GetMapping("/student")
	public String myMessage() {
		return "2020ICT18";
	}
}
