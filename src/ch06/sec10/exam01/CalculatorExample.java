package ch06.sec10.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		Calculator calc = new Calculator();
		int result4 = calc.plus(2, 3);
		System.out.println("result4 : " + result4);
		
		System.out.println("calc.pi : " + calc.pi);
		
		calc.pi = 5.14159;		//메소드 영역의 pi 값 수정
		System.out.println("calc.pi : " + calc.pi);
		
		Calculator calc2 = new Calculator();
		System.out.println("calc2.pi : " + calc2.pi);
	}
}
