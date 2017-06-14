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
		return "view"; // member ���� ���� view.jsp�� ����� ǥ�õȴ�
	}

}