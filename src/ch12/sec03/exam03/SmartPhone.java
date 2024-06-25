package ch12.sec03.exam03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override	//toString() 메소드 재정의해서 제조사와 운영체제가 결합된 문자열 리턴
	public String toString() {
		return company + ", " + os;
	}
}

