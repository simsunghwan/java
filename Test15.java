package Test;

public class Test15 {
	public static void main(String args[]) {
		/*
		  정수 num과 k가 매개변수로 주어질 때, 
		  num을 이루는 숫자 중에 k가 있으면 num의 
		  그 숫자가 있는 자리 수를 return하고 없으면 
		  -1을 return 하도록 solution 함수를 완성해보세요.
		*/
		int num = 29183;
		int k = 1;
		
		int answer = -1;
		int i = 0;
		int check = -1;
		while(num > 0) {
			if (num % 10 == k) {
				check = i;
			}
			num = num/10;
			i++;
		}
		System.out.println(i);
		if (check != -1) {
			answer = i - check;
		}
		System.out.println(answer);
		
		
	}
}
