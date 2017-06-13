package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BeginController {
	
	@RequestMapping("/hello") //요청 url중 /hello 경로가 표시되었을 때
	public String hello(Model model,
			@RequestParam(value = "names", required = false)
		    String name){
		
		model.addAttribute("greeting","안녕하세요"+name);
		
		return "begin"; // view의 이름.
		
	}
	
	@RequestMapping("/begin") //요청 url중 /hello 경로가 표시되었을 때
	public String begin(Model model,
			@RequestParam(value = "id", required = false)
		    String name){
		
		model.addAttribute("greeting","아이디는 "+name);
		
		return "begin"; // view의 이름.
		
	}
}