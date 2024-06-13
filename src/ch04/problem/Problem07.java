package ch04.problem;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			//맞춰야 되는 수 : 1~100
			int random = (int) (Math.random()*100) + 1;
			
			System.out.println("[숫자 맞추기 게임 시작]");
			System.out.println();
			
			int num;	//입력받는 num 저장
			do {
				System.out.print(">>");
				num = scanner.nextInt();
				if (num > random) {
					System.out.println("더 낮게");
				} else if (num < random) {
					System.out.println("더 높게");
				}
			} while (num != random);	//num이 random이 아니라면 계속 반복
			
			scanner.nextLine(); // 버퍼 비우기
			
			System.out.println("맞았습니다.");
			
			//게임 종료 여부
			System.out.print("게임을 종료하시겠습니까? (y/n) >>");
			String str = scanner.nextLine();
			
			if (str.equals("y")) {
				System.out.println("[숫자 맞추기 게임 종료]");
				break;		//while문 빠져나오기
			} else if (str.equals("n")) {
				System.out.println("[숫자 맞추기 게임 다시 시작]");  //while문 재시작
			}
		}
	}
}
