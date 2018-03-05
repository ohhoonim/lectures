package com.ohhoonim.board.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ohhoonim.board.service.BoardService;
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
		
		return "redirect:/board/boardList.do";
	}
	
	@RequestMapping("/board/boardAddView.do")
	public String boardAddView(@RequestParam Map<String, String> req, ModelMap model ) {
		
		return "board/boardAdd";
	}
	
	@RequestMapping("/board/boardAdd.do")
	public String boardAdd(@RequestParam Map<String, String> req, ModelMap model ) {
		
		return "redirect:/board/boardList.do";
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
