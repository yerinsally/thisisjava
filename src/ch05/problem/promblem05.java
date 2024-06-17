package ch05.problem;

public class promblem05 {
	public static void main(String[] args) {
		int[] data = new int[6];
		
		for(int i=0; i<data.length; ) {
			//숫자 뽑기
			int num = (int) (Math.random()*45)+1;
			
			//뽑은 숫자가 중복되는지 먼저 확인
			boolean duplicate = false;
			
			for (int j=0; j<i; j++) {
				if (data[j] == num) {
					duplicate = true;
					break;
				}
			if (duplicate = false) {
					data[i] = num;
					i++;
				}
			}
			System.out.print(data[i] + "\t");
		}
	}
}