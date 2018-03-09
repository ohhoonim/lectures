package object;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.beans.DeptVo;

public class ObjectTest {

	@Test
	public void toStringTest() {
		DeptVo vo = new DeptVo();
		vo.setDeptNo("1001");
		vo.setDName("영업부");
		vo.setLoc("부산");
		
		assertThat(vo.getDeptNo(), is("1001"));
		assertThat(vo.toString(), is("1001_영업부_부산"));
		
		
		DeptVo vo1 = new DeptVo();
		vo1.setDeptNo("1002");
		vo1.setDName("경영지원부");
		vo1.setLoc("인천");
		
		assertThat(vo1.getDeptNo(), is("1002"));
		
		// "부서번호_부서명_부서위치"
		assertThat( 
				vo1.getDeptNo() + "_" +
				vo1.getDName() + "_" +
				vo1.getLoc()
				, is("1002_경영지원부_인천"));
		
		assertThat(vo1.toString()
				, is("1002_경영지원부_인천"));
	}

}








