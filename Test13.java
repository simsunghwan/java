package Test;
	/*
		정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 
		return하도록 solution 함수를 완성해주세요
		*/
public class Test13 {
	public static void main (String args[]) {
		int n = 1234;
		String copy = String.valueOf(n);
		
		int answer = 0;
        for (int i = 0; i < copy.length();i++) {
            answer += copy.charAt(i) - 48;
        }
		
	}
}
