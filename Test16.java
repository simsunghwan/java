package Test;

public class Test16 {
	public static void main(String args[]) {
		 /*
		 두 배열이 얼마나 유사한지 확인해보려고 합니다.
		 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 
		 return하도록 solution 함수를 완성해주세요.
		 */
		String s1[] = new String[] {"a", "b", "c"};
		String s2[] = new String[] {"com", "b", "d", "p", "c"};
		int answer = 0;
		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}//if
			}//for
		}//for
		
	}//main
}//class
