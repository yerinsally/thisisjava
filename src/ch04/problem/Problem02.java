package ch04.problem;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int end = scanner.nextInt();

		for (int i = 1; i <= end; i++) { // i = 반복될 숫자
			for (int j = 0; j < i; j++) { // j = 숫자가 출력되는 개수
				System.out.print(i);
			}
			System.out.println();
		}

		// 역순으로 출력되는 방법

//		for (int i = end; i > 0; i--) {		//i = 반복될 숫자
//      for (int j = 0; j < i; j++) {		//j = 출력되는 숫자의 개수
//          System.out.print(i);
//      }
//      System.out.println();
//  }

		for (; end > 0; end--) {
			for (int k = 0; k < end; k++) {
				System.out.print(end);
			}
			System.out.println(); // 변수 덜 쓰는 방법
		}
	}
}
