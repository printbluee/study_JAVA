package himedia.spring.ver1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 해당 클래스가 Controller 임을 나타내기 위한 어노테이션
@Controller
public class ItemController {
	
	// [handler] 핸들러 메서드
	// @GetMapping 를 안했을 경우 최상위로 인식
	// 붙여주는 것이 좋음
//	@GetMapping
//	public String welcome() {
//		return "welcome";
//	}
//	
//	@GetMapping("/welcome")
//	public String welcome2() {
//		return "welcome";
//	}
	
	@GetMapping({"/", "/welcome"})
	public String welcome3() {
		return "welcome";
	}
	
	@GetMapping("/item")
	public String item() {
		return "item";
	}
	
	@GetMapping("/item-list")
	public String items() {
		return "items";
	}
	
	@GetMapping("/books/book")
	public String book() {
		return "book";
	}
	
	@GetMapping("/item-view")
	public String itemView(Model model) {
		model.addAttribute("title", "새우깡");
		model.addAttribute("price", "1,500원");
		return "item-view";
	}
}
