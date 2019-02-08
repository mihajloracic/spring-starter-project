package tech.thursday.tech;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/private")
public class PrivateController {
	
	@GetMapping
	public ResponseEntity<String> hello2(){
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
}
