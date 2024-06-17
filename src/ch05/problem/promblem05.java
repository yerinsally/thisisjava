package ch05.problem;

public class promblem05 {
	public static void main(String[] args) {
		int[] data = new int[6];
		
		//증감식 조건(i++) 넣지 X
		for(int i=0; i<data.length; ) {
			
			//1~45 랜덤 숫자 뽑기 : (Math.random()*최댓값)+최솟값
			int num = (int) (Math.random()*45)+1;
			
			//뽑은 숫자가 중복되는지 먼저 확인
			boolean duplicate = false;
			
			//중복되면 다시 랜덤 숫자 뽑기
			for (int j=0; j<i; j++) {
				if (data[j] == num) {
					System.out.println("중복되는 숫자 발생 > " + num);
					duplicate = true;
					break;
				}
			}
			//중복되지 않으면 배열에 숫자 넣기 : 
			if (duplicate == false) {
				data[i] = num;
				i++;
			}
		}
		//랜덤 숫자 배열 출력
		for(int k=0; k<data.length; k++) {
			System.out.print(data[k] + "\t");
		}
	}
}