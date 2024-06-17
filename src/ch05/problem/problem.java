package ch05.problem;

import java.util.Scanner;

public class problem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] scores = null;
		//boolean run = true;
		int in = 0;
		
		while (true) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 >");
			
			//Integer.parseInt(scanner.nextLine()) : 문자열로 받아서 int형으로 변환
			int num;
			num = Integer.parseInt(scanner.nextLine());
			
			if (num == 1) {
				System.out.print("학생수 >");
				in = Integer.parseInt(scanner.nextLine());
				//student += in;
				scores = new int[in];
			} else if (num == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = Integer.parseInt(scanner.nextLine());
					
				}
			} else if (num == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] >" + scores[i]);
				}
			} else if (num == 4) {
				int max = 0;
				double sum = 0;
                for(int i=0; i<scores.length; i++) {
                	if(scores[i] > max) {
                		max = scores[i];
                	}
					sum += scores[i];
				}
                System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double)sum/scores.length);
            } else if (num == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
            }
		}
	}
}