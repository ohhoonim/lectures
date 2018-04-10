package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import api.lang.EmpVo;

public class ListTest2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		// <String>  <== ���׸�
		list.add("kim");  // index : 0
		list.add("park"); // index : 1
		list.add("choi"); // index : 2
		
		list.get(0);  // <- "kim"
		list.get(2);  // <- "choi"
		
//		list.get(10); // <- exception 
		list.size(); // <- ����Ʈ�� ũ�⸦ �����´�. �迭�� length
		
		// foreach  , for..in
		for (String str: list) {
			System.out.println(str);
		}
		
		// ����Ʈ���� emp�� ������  ���̸� ����
		List<EmpVo> empList = new ArrayList<EmpVo>();
		
		EmpVo empvo1 = new EmpVo();
		empvo1.setEmpNo("1000");
		empvo1.setEmpName("kim");
		empvo1.setEmpAge(23);
		
		empList.add(empvo1);
		
		EmpVo empvo2 = new EmpVo();
		empvo2.setEmpNo("2000");
		empvo2.setEmpName("park");
		empvo2.setEmpAge(33);
		
		empList.add(empvo2);
		
		EmpVo empvo3 = new EmpVo();
		empvo3.setEmpNo("3000");
		empvo3.setEmpName("choid");
		empvo3.setEmpAge(19);
		
		empList.add(empvo3);
		
		for (EmpVo emp: empList) {
			int curAge = emp.getEmpAge();
			emp.setEmpAge(curAge + 1);
		}
		
		for (EmpVo emp: empList) {
			System.out.println(emp.toString());
		}
		
		// 1. Comparable  <- ����Ʈ ���Ĺ��
		// ���̼����� ��Ʈ�ϱ�
		Collections.sort(empList);
		
		System.out.println("=====���̼����� ���� ��=========");
		for (EmpVo emp: empList) {
			System.out.println(emp.toString());
		}
		
		System.out.println("=====���ڿ� ���� =========");
		List<String> strList = new ArrayList<String>();
		strList.add("korea");
		strList.add("japan");
		strList.add("brazil");
		Collections.sort(strList);
		for(String c: strList) {
			System.out.println(c);
		}
		
		// 2. Comparator  <- �׿� �߰����� ���Ĺ���� ������ ��
		// �̸� ������ ��Ʈ�ϱ�
		Collections.sort(empList, new EmpNameComparator());
		System.out.println("=====�̸������� ���� ��=========");
		for (EmpVo emp: empList) {
			System.out.println(emp.toString());
		}
		
		// �͸�Ŭ����
		// ������ȣ�� ��Ʈ�ϱ�
		Collections.sort(empList, new Comparator<EmpVo>() {

			@Override
			public int compare(EmpVo o1, EmpVo o2) {
				String empno1 = o1.getEmpNo();
				String empno2 = o2.getEmpNo();
				return empno1.compareTo(empno2);
			}
			
		});
		
		System.out.println("=====�����ȣ������ ���� ��=========");
		for (EmpVo emp: empList) {
			System.out.println(emp.toString());
		}
		
		// �ǽ�����
		// 
		// 1. �Ʒ� �����͸� ������ �� �ִ� ScoreVo�� �����϶�.(��, total ����)
		/*
 	     name   la  ma  sc        	total
		 kim	34	23	76			/172
		 ahn	65	34	98 			/197
		 moon	34	56	87			/177
		 hong	97	78	58			/233
		*/
		System.out.println("=======�ǽ�����=======");
		
		
		//System.out.println(score.toString());
		
		// 2. List��  ScoreVo Ÿ������ �� �����͸� �߰��϶�(total����)
		//    List<ScoreVo> list = new ArrayList<ScoreVo>();
		//    list.add()
		List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
		
		ScoreVo score1 = new ScoreVo();
		score1.setName("kim");
		score1.setLa(34);
		score1.setMa(23);
		score1.setSc(76);
		scoreList.add(score1);
		
		ScoreVo score2 = new ScoreVo();
		score2.setName("ahn");
		score2.setLa(65);
		score2.setMa(34);
		score2.setSc(98);
		scoreList.add(score2);
		
		ScoreVo score3 = new ScoreVo();
		score3.setName("moon");
		score3.setLa(34);
		score3.setMa(56);
		score3.setSc(87);
		scoreList.add(score3);
		
		ScoreVo score4 = new ScoreVo();
		score4.setName("hong");
		score4.setLa(97);
		score4.setMa(78);
		score4.setSc(58);
		scoreList.add(score4);
		
		System.out.println("----- ���� ��");
		for (ScoreVo score: scoreList) {
			System.out.println(score.toString());
		}
		
		// 3. la + ma + sc  �� ���� �������� �������� �����Ͻÿ�. 
		// ScoreVo�� Comparable�� �������� ���� Collections.sort( ) �� 
		// Comparator�� �͸�Ŭ������ �����ϴ� ����� ����Ͻÿ�. 
		
		// ���� ������ ���� Comparator �̿�
		Collections.sort(scoreList, new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo o1, ScoreVo o2) {
				int total1 = o1.getLa() + o1.getMa() + o1.getSc();
				int total2 = o2.getLa() + o2.getMa() + o2.getSc();
				
				return total1 - total2;
			}
			
		});
				
		System.out.println("----- ���� ��");
		for (ScoreVo score: scoreList) {
			System.out.println(score.toString());
		}
		
		
		
		
		
	}
}
