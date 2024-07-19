package himedia.spring.ver2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * [ view 저장 위치에 따른 웹 개발 종류 ] =================================
 * ------------------------------------------------------------------------
 *            구분           |      파일 위치      |         처리         |
 * ------------------------------------------------------------------------
 * 1. static  content (정적) | resources/static	   | -                    |
 * 2. dynamic content (동적) | resources/templates | View Resolver        |
 * 3. API                    | -                   | HttpMessageConverter |
 * ------------------------------------------------------------------------
 * 
 * 1. static content
 * - 서버에서 파일을 그대로 웹 브라우저에 전달
 * - 파일 위치 : resources/static
 * 
 * 2. dynamic content
 * - 서버에서 HTML 을 동적 변경하여 웹 브라우저에 전달
 * - 파일 위치 : resources/templates/{ ViewName }.html
 * - MVC : Model(data), View(html), Controller(handler)
 * 
 * 3. API
 * - JSON 을 의미
 * - JSON 포맷으로 데이터 전송
 * - 객체를 넘길 수 있음 : HttpMessageConverter 가 JSON 으로 변환 
 *   (예전에는 직렬화 했음)
 * ========================================================================
 */

@Controller // 클래스 레벨 어노테이션
public class BasicController {
	
	/**
	 * 2-1. MVC =============================
	 * ======================================
	 */
	@GetMapping("/first-mvc")
	public String firstMvc() {
		return "first"; // View Resolver 가 받음
	}
	
	@GetMapping("/bestseller")
	public String bestseller() {
		return "book/bestseller";
	}
	
	/**
	 * 2-2. MVC =============================
	 * : template engine 을 통해 데이터 표현
	 * : template engine - thymeleaf 타임리프
	 * ======================================
	 */
	@GetMapping("/second-mvc")
	public String secondMvc(Model model) {
		model.addAttribute("name", "홍길동");
		return "second";
	}
	
	/**
	 * 2-3. MVC =============================
	 * : 쿼리 파라미터 (query parameter) 처리
	 * (@RequestParam("key") String fruit)
	 * key   는 String 이라 쌍따옴표 
	 * value 는 String 타입으로 변수에 저장
	 * 파라미터와 변수명을 같게 해줌
	 * ======================================
	 */
	// [형태 1] ------------------------------------------------
//	@GetMapping("/third-mvc")
//	public String thirdMvc(@RequestParam("fruit") String fruit) {
//		System.out.println("fruit >> " + fruit);
//		return "third";
//	}
	
	// [형태 2] ------------------------------------------------
//	@GetMapping("/third-mvc")
//	public String thirdMvc(@RequestParam(name="fruit") String fruit,
//			Model model) {
//		System.out.println("fruit >> " + fruit);
//		System.out.println("[요소 추가 전] model >> " + model);
//		model.addAttribute("fruit", fruit);
//		System.out.println("[요소 추가 후] model >> " + model);
//		return "third";
//	}
	
	// [형태 3] ------------------------------------------------
	// [과제] : 버전업이 되면서 window - Preference - java - compiler - 체크
	@GetMapping("/third-mvc")
	public String thirdMvc(@RequestParam String fruit, Model model) {
		model.addAttribute("fruit", fruit);
		return "third";
	}
	
	// URL : http://localhost:8080/third-mvc?fruit?&count=5
	@GetMapping("/fruit")
	public String fruitCount(@RequestParam("count") int count,
			Model model) {
		model.addAttribute("count", count);
		return "quiz-fruit-count";
	}
	
	/**
	 * 3-1. API =============================
	 * : String 으로 전송
	 * ======================================
	 */
	@GetMapping("/api-one")
	@ResponseBody // 응답하는 메세지 body, View x
	public String apiOne() {
		return "String...";
	}
	
	/**
	 * 3-2. API =============================
	 * : JSON 형식으로 전송
	 * : HttpMessageConverter
	 * ======================================
	 */
	// 많은 객체를 보낼 땐 컬렉션으로 보내기
	@GetMapping("/api-two")
	@ResponseBody // 응답하는 메세지 body, View x
	public Student apiTwo(@RequestParam("name") String name,
			@RequestParam("age") int age) {
		
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		
		return student; // 직렬화됨
	}
	
	// 원래 여기에 만들면 x
	// 직렬화를 할 때 보여지는 키값은 필드명이 아닌 getName 으로 보여짐
	// getName 이 아닌 getHaha 으로 하면 "haha" : "홍길동" 으로 보여짐
	// 필드는 타입이 private, 숨겨짐
	class Student {
		private String name;
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
	
}
