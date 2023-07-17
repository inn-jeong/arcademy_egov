package egovframework.example.sample.web;

import java.io.OutputStream;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {

	@Resource(name = "memberService")
	private MemberService memberService;
	
	@RequestMapping("/login.do")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("/login_ok.do")
	public String loginOk() {
		return "member/login_ok";
	}
	
	public int selectMember(MemberVO vo) throws Exception {
		MemberVO user = memberService.selectMember(vo);
		int re = 0;
		if(user != null) {
			if(user.getMem_pwd().equals(vo.getMem_pwd())) {
				re = 1;
			}else {
				re = 2;
			}
		}
		return re;
	}
	
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String addSampleView() throws Exception {
		return "member/register";
	}

	
	@RequestMapping(value = "/insertMember.do", method = RequestMethod.POST)
	public String addSample(MemberVO vo, Model model)
			throws Exception {

		memberService.insertMember(vo);
		return "forward:/login.do";
	}
	
	@RequestMapping("/login_process.do")
	public String login_process(MemberVO vo, Model model) throws Exception {
		log.info("@# login_process start");
		int re = selectMember(vo);
		String str = "";
		if(re == 1) {
			str = "forward:/login_ok.do";
		}else {
			str = "forward:/login.do";
		}
		log.info("@# login_process end");
		return str;
	}
}
