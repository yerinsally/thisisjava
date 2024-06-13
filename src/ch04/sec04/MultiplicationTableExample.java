package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
				//System.out.printf("%d x %d = %d\n", m, n, m*n);  //해당 식으로도 출력 가능
			}
		}
	}
}

