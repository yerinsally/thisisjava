package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
//		intArray[0] = 10;	 		//NullPointerException
		intArray = new int[5];		//예외 발생하지 않으려면 new
		intArray[0] = 10;
		System.out.println(intArray[0]);	

//		String str = null;
//		System.out.println("총 문자수: " + str.length() );	  //NullPointerException
		String str = new String("Hello");
		System.out.println("총 문자수: " + str.length());
	}
}
