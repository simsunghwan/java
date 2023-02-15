package Test;

public class Test2 {
	public static void main(String args[]) {
		/*
		2 < common의 길이 < 1,000
		-1,000 < common의 원소 < 2,000
		common의 원소는 모두 정수입니다.
		등차수열 혹은 등비수열이 아닌 경우는 없습니다.
		등비수열인 경우 공비는 0이 아닌 정수입니다.
		*/
		
		int common[] = new int[]{1, 2, 3, 4};
		int answer = 0;
		
		if(common.length > 2 && common.length < 1000) {
			int a = common[1] - common[0];	
			if(common[2] - common[1] == a) {
				answer = common[common.length - 1] + a; 
			} else {
				answer = common[common.length - 1] * (common[1] / common[0]);
			}
		}
		
		
		
	}
}
