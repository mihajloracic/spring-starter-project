package tech.thursday.tech;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.thursday.tech.generics.GenericRestController;
import tech.thursday.tech.model.TestEntity;

@RestController
@RequestMapping("/public")
public class TestController extends GenericRestController<TestEntity>{
	
}