package ch04.problem;

public class Problem03 {
	public static void main(String[] args) {
		for(int m=1; m<=9; m++) {
			for(int n=2; n<=9; n++) {
				System.out.print(n + "*" + m + "=" + (n*m) + "\t");
			}
			System.out.println();
		}
	}
}
