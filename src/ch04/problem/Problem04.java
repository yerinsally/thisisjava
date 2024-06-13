package ch04.problem;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		System.out.println();
		
		int max = 0;

		for(int i=0; i<5;i++) {
			System.out.print("숫자: ");
			int number = scanner.nextInt();
			if(number > max) {
				max = number;
			}
		}
		System.out.println("최대값은 " + max + "입니다");
		
	}
}
