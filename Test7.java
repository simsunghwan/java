package Test;

public class Test7 {
	public static void main(String args[]) {
		
		int array[] = new int[] {7, 77, 17};
		
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			String copy = String.valueOf(array[i]);
			for(int j = 0; j < copy.length(); j++) {
				if (copy.charAt(j)- 48 == 7) {
					count += 1;
				}
			}
			
			
		}
		
	}
}
