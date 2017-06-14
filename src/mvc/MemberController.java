package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	MemberDao dao;

	public MemberController() {

	}

	public MemberController(MemberDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="member/view.do", method={RequestMethod.GET, RequestMethod.POST})
	public String view(MemberVo vo) {
		MemberVo v = dao.view(vo);
		vo.setUserpwd(v.getUserpwd());
		return "view"; // member 폴더 안의 view.jsp에 결과가 표시된다
	}

}