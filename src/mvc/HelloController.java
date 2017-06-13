package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/abc") //��û url�� /hello ��ΰ� ǥ�õǾ��� ��
	public String abc(Model model,
			@RequestParam(value = "name", required = false)
		    String name){
		
		model.addAttribute("greeting","�ȳ��ϼ���"+name);
		
		return "hello"; // view�� �̸�.
		
	}
}