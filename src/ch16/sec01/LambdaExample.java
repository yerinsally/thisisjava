package ch16.sec01;

public class LambdaExample {
	public static void main(String[] args) {
		action((x, y) -> {		//람다식을 하나의 객체로 만듦
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}

	public static void action(Calculable calculable) {	//인터페이스가 클래스처럼 작용함
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x, y);
	}
}

