package com.multi.mvc;

public class TestClass {
	
	void test1(String name) {
		System.out.println("User2의 변경사항, versiosn 2");
		
		if(name.equals("홍길동")) {
			System.out.println("홍길동입니다.");
		}
	}
	
	void test2(String name) {
		System.out.println("User2의 변경사항, versiosn 3");
		
		if(name.equals("최길동")) {
			System.out.println("최길동입니다.");
		}
		if(name.equals("박길동")) {
			System.out.println("박길동입니다.");
		}
	}

	void test3(String name) {
		System.out.println("User2의 변경사항, versiosn 4");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("안녕?");
		}
	}
	
	void test4(String name) {
		System.out.println("User1의 변경사항, mastrt 작성 versiosn 4");
		
		for(int i = 0; i < 100; i++) {
			System.out.println("안녕?");
		}
	}
}
