package com.ohhoonim.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ohhoonim.board.service.BoardService;
import com.ohhoonim.dao.BoardDao;
import com.ohhoonim.vo.EmpVo;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Resource(name="boardDao")
	BoardDao boardDao;
	
	@Override
	public List<EmpVo> boardList() {
		List<EmpVo> list = boardDao.boardList();
		return list;
	}

	@Override
	public EmpVo boardDetail(String empno) {
		EmpVo empvo = boardDao.boardDetail(empno);
		return empvo;
	}

}







