package ch04.problem;

import java.util.Scanner;

public class Problem07_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputNum = "";
		System.out.print("게임 시작");
		
		//3. 맞췄을 경우 게임 계속 진행 여부 판단
		boolean run = true;
		
		while(run) {
			// 1. 1~100 랜덤 숫자 얻기
			int random = (int) (Math.random()*100)+1;
			System.out.println(random);
			
			//2. 입력한 수와 랜덤 숫자 비교 후 맞추기 유도
			while(true) {
				inputNum = scanner.nextLine();
				if(Integer.parseInt(inputNum) < random) {	//int형으로 바꾸기
					System.out.println("더 높게");
				}else if(Integer.parseInt(inputNum) > random) {
					System.out.println("더 낮게");
				}else {
					//3. 맞췄을 경우 게임 계속 진행 여부 판단
					System.out.println("맞았습니다");
					System.out.print("게임을 종료하겠습니까?(y/n) >>");
					String answer = scanner.nextLine();
					if ("y".equals(answer)) {
						run = false;
					}
					break;
				}
			}
		}
	}
}
