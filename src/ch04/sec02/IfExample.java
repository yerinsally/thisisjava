package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90점 미만입니다.");
			System.out.println("등급은 B 입니다."); //if문과 상관없이 출력되는 실행문
	}
}
