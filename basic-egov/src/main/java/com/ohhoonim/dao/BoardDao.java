package com.ohhoonim.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ohhoonim.vo.DeptVo;
import com.ohhoonim.vo.EmpVo;

@Repository("boardDao")
public class BoardDao extends Mapper {

	public List<EmpVo> boardList() {
		return selectList("boardList", null);
	}

	public EmpVo boardDetail(String empno) {
		return selectOne("boardDetail", empno);
	}

	public int boardRemove(String empno) {
		return delete("boardRemove", empno);
	}

	public int boardAdd(EmpVo vo) {
		return insert("boardAdd", vo);
	}

	public List<DeptVo> deptList() {
		return selectList("Board.deptList", null);
	}

}
