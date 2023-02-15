package Test;

public class Test6 {
	public static void main(String args[]) {
		/*
		문자열 my_str과 n이 매개변수로 주어질 때,
		my_str을 길이 n씩 잘라서 저장한 배열을 
		return하도록 solution 함수를 완성해주세요.
		*/
		
		
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		int check = 0;
		int num;
		if (my_str.length() % n == 0) {
			num = my_str.length() / n;
		} else {
			num = my_str.length() / n + 1;
		}
		String answer[] = new String[num];
		String A = "";
		for(int i = 0 ; i < my_str.length(); i++) {
			A += my_str.charAt(i);
			if(i % n == n - 1 || i == my_str.length() - 1) {
				answer[check] = A;
				check++;
				System.out.println(A);
				A = "";
	
			}
		}

		
	}
}
