package ch04.problem;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		System.out.println();
		
		int num = scanner.nextInt();
		int answer = 0;
		
		if(num % 2 == 0) {		//짝수일 경우 짝수만 더하기
			for(int i=0; i<=num; i++) {
	            if (i % 2 == 0) {
	                answer += i;
	            }
	        }
		}else {					//홀수일 경우 홀수만 더하기
			for(int i=0; i<=num; i++) {
	            if (i % 2 != 0) {
	                answer += i;
	            }
	        }
		}
		System.out.print("결과값: " + answer);
	}
}
