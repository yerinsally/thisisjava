package ch06.problem;

public class StringUtil {
    
    public static String concatString(String[] arr){
    	//메소드 내용작성 : arr 배열의 모든 원소의 문자열을 하나로 합치기
//    	StringBuilder answer = new StringBuilder();
//        for(String str : arr) {
//        	answer.append(str);
//        }
//        return answer.toString();
        
    	//String 객체는 합산이 가능함!
        String str = new String();
        for(String a : arr) {
        	str += a;
        }
        return str;
    }
}
