package com.ohhoonim.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ohhoonim.board.service.BoardService;
import com.ohhoonim.dao.BoardDao;
import com.ohhoonim.vo.DeptVo;
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

	@Override
	public int boardRemove(String empno) {
		int resultCnt = boardDao.boardRemove(empno);
		return resultCnt;
	}

	@Override
	public int boardAdd(EmpVo vo) {
		int resultCnt = boardDao.boardAdd(vo);
		return 0;
	}

	@Override
	public List<DeptVo> deptList() {
		List<DeptVo> deptList = boardDao.deptList();
		return deptList;
	}

	@Override
	public int boardModify(EmpVo vo) {
		return boardDao.boardModify(vo);
	}

}







