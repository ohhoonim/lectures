package com.ohhoonim.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ohhoonim.vo.EmpVo;

@Repository("boardDao")
public class BoardDao extends Mapper {

	public List<EmpVo> boardList() {
		return selectList("boardList", null);
	}

	public EmpVo boardDetail(String empno) {
		return selectOne("boardDetail", empno);
	}

}
