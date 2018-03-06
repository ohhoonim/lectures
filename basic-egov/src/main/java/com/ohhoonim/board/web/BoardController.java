package com.ohhoonim.board.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ohhoonim.board.service.BoardService;
import com.ohhoonim.vo.DeptVo;
import com.ohhoonim.vo.EmpVo;

@Controller
public class BoardController {
	@Resource(name="boardService")
	BoardService boardService;
	
	// http://localhost:8080/basic-egov/board/boardList.do
	@RequestMapping("/board/boardList.do")
	public String boardList(@RequestParam Map<String, String> req, ModelMap model ) {
		
		List<EmpVo> list = boardService.boardList();
		
		model.addAttribute("list", list);
		
		return "board/boardList"; 
		// \src\main\webapp\WEB-INF\jsp\board\boardList.jsp
	}
	
	@RequestMapping("/board/boardDetail.do")
	public String boardDetail(@RequestParam Map<String, String> req, ModelMap model ) {
		String empno = req.get("empno");
		
		EmpVo empvo = boardService.boardDetail(empno);
		
		model.addAttribute("empvo", empvo);
		
		return "board/boardView";
	}
	
	@RequestMapping("/board/boardRemove.do")
	public String boardRemove(@RequestParam Map<String, String> req, ModelMap model ) {
		String empno = req.get("empno");
		
		int resultCnt = boardService.boardRemove(empno);
		// insert, update, delete 쿼리문에 대한 결과값은 
		// int 형이다. 
		// ==> x 행이 삭제되었습니다. 
		
		return "redirect:/board/boardList.do";
		// redirect가 붙어있으면 jsp가 아니라 url을 호출하는 것임.
	}
	
	@RequestMapping("/board/boardAddView.do")
	public String boardAddView(@RequestParam Map<String, String> req, ModelMap model ) {
		
		List<DeptVo> deptList = boardService.deptList();
		
		model.addAttribute("deptList", deptList);
		
		return "board/boardAdd";
	}
	
	@RequestMapping("/board/boardAdd.do")
	public String boardAdd(@RequestParam Map<String, String> req, RedirectAttributes reAttr ) {
		
		String returnStr = "redirect:/board/boardList.do";
		
		String empno = req.get("empno"); ///
		String ename = req.get("ename"); ///
		String sal   = req.get("sal");
		String manager  = req.get("manager");
		String deptno   = req.get("deptno");
		String hiredate = req.get("hiredate");
		String age   = req.get("age"); ///
		String comm  = req.get("comm");

		if ( empno == null || empno.length() < 1 
				|| ename == null || ename.length() < 1
				|| age == null || age.length() < 1) {
			reAttr.addFlashAttribute("rtnParams", req);
			returnStr = "redirect:/board/boardAddView.do";
		} else {
			EmpVo vo = new EmpVo();
			vo.setEmpno(empno);
			vo.setEname(ename);
			vo.setSal(sal);
			vo.setManager(manager);
			vo.setDeptno(deptno);
			vo.setHiredate(hiredate);
			vo.setAge(age);
			vo.setComm(comm);
			
			int resultCnt = boardService.boardAdd(vo);
		}
		
		return returnStr;
	}
	
	@RequestMapping("/board/boardModifyView.do")
	public String boardModifyView(@RequestParam Map<String, String> req, ModelMap model ) {
		
		return "board/boardModify";
	}
	
	@RequestMapping("/board/boardModify.do")
	public String boardModify(@RequestParam Map<String, String> req, ModelMap model ) {
		
		return "redirect:/board/boardList.do";
	}
	
	
	
	
	
	
	
	
	
	
	
}
