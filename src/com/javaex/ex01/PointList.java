package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	private Point[] pArray;
	private int crtPos;
	
	public PointList() {
		this.pArray = new Point[3];
		this.crtPos = 0;
	}

	public void add(Point p) {
		pArray[crtPos] = p;
		crtPos++;
	}
	
	public Point get(int index) {
		Point result = pArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
