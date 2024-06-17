package ch05.problem;

import java.util.Scanner;

public class promblem02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num;
		int sum = 0;
		int[] data = new int[5];
		
		for(int i=0; i<data.length; i++) {
			num = scanner.nextInt();
			data[i] = num;
			sum += data[i];
		}
		
		double avg = (double) sum / data.length;
		System.out.println("평균은 " + avg + "입니다");
	}
}
