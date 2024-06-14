package problem;

public class promblem02 {

	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int count = 0;
		int sum = 0;
		for (int i : data) {
			if (i % 3 == 0) {
				count += 1;
				sum += i;
			}
		}
//		for(int i=0; i < data.length; i++) {
//			if (data[i] % 3 == 0) {
//				number ++;
//				sum += data[i];
//			}
//		}
		System.out.println("주어진 배열에서 3의 배수의 개수 > " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 > " + sum);
	}
}
