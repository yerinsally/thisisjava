package ch05.sec05;

public class EmptyStringExample {
	public static void main(String[] args) {	
		String hobby = "";
		if(hobby.equals("")) {		//hobby 변수는 객체가 된 상태이기 때문에 equals로 비교 가능
		   System.out.println("hobby 변수가 참조는 String 객체는 빈문자열");
		}
		   
//		String hobby2 = null;
//		if(hobby2.equals("")) {
//			System.out.println("hobby2 변수가 참조는 String 객체는 빈문자열");	//예외 출력됨
//		}
	}
}