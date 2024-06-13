package ch02.sec02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수 = 11
		int var2 = 0206; //8진수 = 134
		int var3 = 365; // 10진수 = 365
		int var4 = 0xB3; //16진수 = 179
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4); //10진수로 출력됨
	}

}
