package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1,11);
		Point p02 = new Point(2,22);
		Point p03 = new Point(3,33);
		
		pMap.put("권상우", p01);
		pMap.put("권상우", p02);
		pMap.put("권상우", p03);
		
		System.out.println(pMap.toString());
		
		Set<String> keySet = pMap.keySet();
		
		for(String key : keySet) {
			System.out.println(pMap.get(key).getX());
		}
		
		
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("regData", "2021-12-08");
		boardMap.put("content", "게시판 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		

	}

}
