package ch04.problem;

public class Problem01 {
	public static void main(String[] args) {
		// 1~100까지 수에서 5의 배수이자 7의 배수 출력
		int i = 1;
		for (;;) {
			if (i <= 100) {
				if (i % 5 == 0 && i % 7 == 0) {
					System.out.println(i);
				}
				i = i + 1;
			} else {break;}

		}
	}
}