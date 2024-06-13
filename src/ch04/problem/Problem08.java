package ch04.problem;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//money는 while문 밖에서 초기화, while문 안에다 쓰면 계쏙 0으로 초기화됨
		int money = 0;
		
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 >");

			int num;
			num = scanner.nextInt();
			
			if (num == 1) {
				System.out.print("예금액 >");
				int in = scanner.nextInt();
				money += in;
			} else if (num == 2) {
				System.out.print("출금액 >");
				int out = scanner.nextInt();
				if (money < out) {
					System.out.println("잔액 부족입니다");
					continue;
				}
				money -= out;
			} else if (num == 3) {
				System.out.print("잔고액 >");
				System.out.println(money);
			} else if (num == 4) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
            }
		}
	}
}