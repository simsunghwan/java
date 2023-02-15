package Test;

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
