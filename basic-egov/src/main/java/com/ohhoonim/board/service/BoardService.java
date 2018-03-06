package com.ohhoonim.board.service;

import java.util.List;

import com.ohhoonim.vo.EmpVo;

public interface BoardService {

	List<EmpVo> boardList();

	EmpVo boardDetail(String empno);

	int boardRemove(String empno);

}
