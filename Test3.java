package Test;

public class Test3 {
	public static void main(String args[]) {
		/*
		연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
		두 정수 num과 total이 주어집니다. 
		연속된 수 num개를 더한 값이 total이 될 때,
		정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
		*/
		int num 	 = 3;
		int total 	 = 12;
		int[] answer = new int[num];
		
		
		int index 	 = 0;
		if (num % 2 == 0) {
				index = (total / num) + 1 - (num / 2);
		
		} else {
		
			index = (total / num) - (num / 2);
		}
		
		for (int i = 0;i < num; i++) {
			answer[i] = index;
			index++;
		}

		
		
		
	}
}
