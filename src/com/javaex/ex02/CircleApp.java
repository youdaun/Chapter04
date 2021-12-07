package com.javaex.ex02;

import com.javaex.ex01.Point;
import com.javaex.ex01.PointList;

public class CircleApp {

	public static void main(String[] args) {

		Circle c01 = new Circle(7);
		Circle c02 = new Circle(10);
		
		CircleList cList = new CircleList();
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.get(0).getRadius());
		System.out.println(cList.get(0).toString());
		
		System.out.println(cList.get(1).getRadius());
		System.out.println(cList.get(1).toString());
		
		System.out.println(cList.size());

	}

}
