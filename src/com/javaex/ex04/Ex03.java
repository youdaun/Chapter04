package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		//HashSet을 이용해서 로또 자동생성기
		Set<Integer> iSet = new HashSet<Integer>();

		while(true) {
		
			if(iSet.size() >= 6) {
				break;
			}
			int num = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자: " + num);
			iSet.add(num);
		}
		
		for(int no:iSet) { //언박싱
			System.out.println(no);
		}


	}

}
