package ch05.problem;

import java.util.Scanner;

public class promblem04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//5만원권 ~ 1원 배열 생성
		int[] data = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		//입력받는 돈
		int money;
		int count;
		System.out.print("금액 : ");
		money = scanner.nextInt();
		
		for (int i : data) {
			count = money / i;
			money %= i;
			System.out.println(i + "원 : " + count + "개");
		}
	}
}