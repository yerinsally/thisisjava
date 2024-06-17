package ch05.problem;

public class promblem03 {
	public static void main(String[] args) {
		char c []= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
			
		}
		System.out.println();
		for(int i=0; i<c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}
		
//		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
//		System.out.println(c);
//		String str = String.valueOf(c);		//valueOf 문자열로 대체
//		str = str.replace(" ",",");
//		System.out.println(str);
	}
}