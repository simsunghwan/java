package Test;

import java.util.Arrays;

public class Test8 {
	public static void main(String args[]) {
		/*영어 대소문자로 이루어진 문자열 my_string이 
		 매개변수로 주어질 때, my_string을 모두 소문자로
		 바꾸고 알파벳 순서대로 정렬한 문자열을 return 
		 하도록 solution 함수를 완성해보세요.*/
		
		String my_string = "heLLo";
		int array[] = new int[my_string.length()];
	
		for(int i = 0; i < my_string.length();i++) {
			if (91 < my_string.charAt(i)) {
				array[i] = my_string.charAt(i);
			} else {
				array[i] = my_string.charAt(i) + 32;
			}	
		}
		Arrays.sort(array);
		for(int i = 0; i < my_string.length();i++) {
		my_string += (char)(array[i]);
		}
		
	}

}
