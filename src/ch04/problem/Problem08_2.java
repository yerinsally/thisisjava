package ch04.problem;

import java.util.Scanner;

public class Problem08_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//money는 while문 밖에서 초기화, while문 안에다 쓰면 계쏙 0으로 초기화됨
		int money = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 >");

			int num;
			int inputNum = 0;
			num = scanner.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액 >");
				inputNum = scanner.nextInt();
				money += inputNum;
				break;
			case 2:
				System.out.print("출금액 >");
				inputNum = scanner.nextInt();
				if(money >= inputNum) {
					money -= inputNum;
				}else {
					System.out.println("잔액 부족입니다");
				}
				break;
			case 3:
				System.out.print("잔고액 >");
				System.out.println(money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
                break;
            default:
            	System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
			}
		}
	}
}