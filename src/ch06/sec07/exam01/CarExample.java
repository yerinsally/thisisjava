package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
		Car myCar2 = new Car();  //하나라도 적은게 있다면 기본 생성자 호출 못함
	}
}

