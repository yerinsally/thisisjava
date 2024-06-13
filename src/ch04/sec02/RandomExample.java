package ch04.sec02;

public class RandomExample {
	public static void main(String[] args) {
		double random = Math.random() * 6;
		int num = (int)(Math.random()*6) + 1;
		System.out.println(random);
		System.out.println(num);
	}
}
