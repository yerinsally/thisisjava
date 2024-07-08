package problem;

public class Main {
    public static void main(String[] args) {
    	System.out.println(reverseString("hello"));
    }
    
    public static String reverseString(String s) {
    	int len = s.length();
    	if (len==0){		//종료 조건 케이스
    		return s;
    	}else {
    		return reverseString(s.substring(1)) + s.charAt(0);		//재귀 케이스
    	}
    }
}
