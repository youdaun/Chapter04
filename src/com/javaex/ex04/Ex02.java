package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		//정수형 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		int i04 = 100;
		Integer i05 = new Integer(13);
		Integer i06 = new Integer(17); //(7)중복저장안됨
		
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04); //자동박싱
		iSet.add(i05);
		iSet.add(i06);
		
		iSet.remove(i05);
		
		System.out.println("갯수:" + iSet.size());
		
		for( Integer no : iSet ) { //향상된 for문을 이용할 수 밖에 없음
			System.out.println(no.toString());
		}
		
		System.out.println(iSet.toString());
		
		System.out.println("==============================");
		
		//Point 관리
		Point p01 = new Point(3,13);
		Point p02 = new Point(1,17);
		Point p03 = new Point(7,12);
		Point p04 = new Point(3,13); //같게 보지 않음
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		pSet.remove(p01);
		
		System.out.println("갯수:" + pSet.size());
		
		for(Point i : pSet) {
			System.out.println(i.getX());
		}
		
		System.out.println(pSet.toString());
		

	}

}
