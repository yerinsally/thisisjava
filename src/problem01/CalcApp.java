package problem01;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	
    	boolean run = true;
    	
    	while(run) {
    		System.out.print(">> ");
    		String[] arr = new String[3];
        	String[] str = scanner.nextLine().split(" ");
        	
        	if ("/q".equals(str[0])) {
        		System.out.println("프로그램 종료");
        		run = false;
        		break;
        	}
        	
        	for(int i=0; i<arr.length; i++) {
        		arr[i] = str[i];
        	}

        	int num1 = Integer.parseInt(arr[0]);
        	int num2 = Integer.parseInt(arr[2]);
        	
    		if("+".equals(arr[1])) {
        		Add add = new Add();
        		add.setValue(num1, num2);
        		System.out.println(">> " + add.calculate());
        	}else if("-".equals(arr[1])) {
        		Sub sub = new Sub();
        		sub.setValue(num1, num2);
        		System.out.println(">> " + sub.calculate());
        	}else if("*".equals(arr[1])) {
        		Mul mul = new Mul();
        		mul.setValue(num1, num2);
                System.out.println(">> " + mul.calculate());
        	}else if("/".equals(arr[1])) {
        		Div div = new Div();
                div.setValue(num1, num2);
                System.out.println(">> " + div.calculate());
        	}else {
        		System.out.println("알 수 없는 연산입니다.");
        	}
    	}
    }
}
