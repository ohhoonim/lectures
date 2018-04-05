package com.ohhoonim.member;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ohhoonim.vo.MemberVo;

@Controller
public class MemberController {
	
	@RequestMapping("/main.do")
	public String main(@RequestParam Map<String, String> req, ModelMap model) {
		
		return "member/main";
	}
	
	@RequestMapping("/login.do")
	public String login(@RequestParam Map<String, String> req, ModelMap model) {
		
		return "member/login";
	}
	
	@RequestMapping("/loginProcess.do")
	public String loginProcess(@RequestParam Map<String, String> req, ModelMap model,
			HttpSession session ) {
		String returnUrl = "redirect:/main.do";
		
		String id = req.get("id");
		String pwd = req.get("pwd");	
		
		/*
		 * 서비스를 호출하는 로직으로 변경예정
		Dao dao = new Dao();
		boolean isMember = dao.isMember(id, pwd);
		*/
		boolean isMember = true;
		
		if (isMember) {
			/* 서비스 호출로 로직 변경예정
			MemberVo vo = new MemberVo();
			vo.setMemberId(id);
			MemberVo memberInfo = dao.findMemberById(vo);
			*/
			MemberVo memberInfo = new MemberVo();
			
			session.setAttribute("memberInfo", memberInfo);
			session.setAttribute("memberId"  , memberInfo.getMemberId());
			
			
		} else {	
			returnUrl = "redirect:/login.do?loginFail=true";
		} 
		
		return returnUrl;
	}
	
	@RequestMapping("/signUp.do")
	public String signUp(@RequestParam Map<String, String> req, ModelMap model) {
		
		return "member/signUp";
	}
	
	@RequestMapping("signUpProcess.do")
	public String signUpProcess(@RequestParam Map<String, String> req, ModelMap model) {
		
		MemberVo vo = new MemberVo();
		
		vo.setMemberId(req.get("memberId"));
		vo.setMemberTp(req.get("memberTp"));
		vo.setPwd(req.get("pwd"));
		vo.setContact(req.get("contact"));
		vo.setRemainPnt(req.get("remainPnt"));
		vo.setRemainPrchPnt(req.get("remainPrchPnt"));
		vo.setChainIdx(req.get("chainIdx"));
		
		/*
		 * 서비스 호출로 변경예정
		Dao dao = new Dao();
		int resultCnt = dao.addMember(vo); 
		*/
		
		return "member/signUpResult";
	}
	
	@RequestMapping("/memberInfo.do")
	public String memberInfo(@RequestParam Map<String, String> req, ModelMap model,
			HttpSession session) {
		String returnUrl = "member/memberInfo";
		
		String memberId = (String)session.getAttribute("memberId");
		
		if (memberId == null) {
			returnUrl = "redirect:/main.do";
		} else {
			MemberVo vo = new MemberVo();
			vo.setMemberId(memberId);
			/* 서비스로 연결예정
			Dao dao = new Dao();
			TbMemberVo memberVo = dao.findMemberById(vo);
			*/
			MemberVo memberVo = new MemberVo();
			model.addAttribute("memberVo", memberVo);
		}
		
		return returnUrl;
	}
	
	@RequestMapping("/logout.do")
	public String logout(@RequestParam Map<String, String> req, ModelMap model,
			HttpSession session) {
		 
		session.removeAttribute("memberInfo");
		session.removeAttribute("memberId");
		
		return "redirect:/main.do";
	}
}














