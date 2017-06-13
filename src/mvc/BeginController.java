package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BeginController {
	
	@RequestMapping("/hello") //��û url�� /hello ��ΰ� ǥ�õǾ��� ��
	public String hello(Model model,
			@RequestParam(value = "names", required = false)
		    String name){
		
		model.addAttribute("greeting","�ȳ��ϼ���"+name);
		
		return "begin"; // view�� �̸�.
		
	}
	
	@RequestMapping("/begin") //��û url�� /hello ��ΰ� ǥ�õǾ��� ��
	public String begin(Model model,
			@RequestParam(value = "id", required = false)
		    String name){
		
		model.addAttribute("greeting","���̵�� "+name);
		
		return "begin"; // view�� �̸�.
		
	}
}