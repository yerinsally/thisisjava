package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	static {
		info = company + "-" + model;
	}	//클래스 로딩되면 실행되는 구문
}
