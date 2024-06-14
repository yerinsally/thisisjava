package ch05.sec07;

public class StringArrayTestExample {
	public static void main(String[] args) {
		String [] languages = new String[3];
		languages[0] = "Java";
		languages[1] = "Java";
		languages[2] = new String("Java");

		System.out.println(languages[0]==languages[1]);         //true : 동일한 번지에 저장
		System.out.println(languages[0]==languages[2]);         //false : 다른 번지가 저장
		System.out.println(languages[0].equals(languages[2]));  //true : 문자열 동일
	}
}
