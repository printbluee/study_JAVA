package himedia.alone.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

	@GetMapping("/food") 
	public String food() {
		return "food";
	}
}
