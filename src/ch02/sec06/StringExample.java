package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";	//출력 시 "문자 포함
		System.out.println(str);
		
		str = "번호\t이름\t직업";	//출력 시 tab만큼 띄움
		System.out.println(str);
		str = "01\t홍길동\t프로그래머";
		System.out.println(str);
		
		System.out.println("나는\n자바를\n배웁니다.");	//출력 시 줄바꿈
	}
}
