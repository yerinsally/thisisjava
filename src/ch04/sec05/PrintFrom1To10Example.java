package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		//for 문
		int i = 1;
		for(/*초기식*/;/*조건식*/;/*증감식*/) {	//for문은 초기식, 조건식, 증감식 생략 가능
			if(!(i <= 10)) {
				break;
			}
			System.out.print(i + " ");
			i++;
		}
		
		//while 문
		int j = 1;
		while (j <= 10) {
			System.out.print(j + " ");
			j++;  //마지막 j 값 = 11
		}
	}
}
