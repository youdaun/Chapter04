package com.javaex.ex03;

import com.javaex.ex01.Point;
import com.javaex.ex02.Circle;

public class MyListApp {

	public static void main(String[] args) {
		
		//MyList<Point> myList = new MyList<Point>();
		
		Point p01 = new Point(5,7);
		Point p02 = new Point(10,15);
		
		Circle c01 = new Circle(7);
		
		MyList<Point> pList = new MyList<Point>(); //Point만 관리
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.toString());
		
		MyList<Circle> cList = new MyList<Circle>(); //Circle만 관리
		cList.add(c01);
		//cList.add(p01); Object로 하면 이런경우가 생김 <T>로 하면 오류남
		
		System.out.println(cList.get(0).getRadius()); //다운캐스팅 하지 않아도됨(오브젝트로 형변환)
		
		System.out.println(cList.toString());

	}

}
