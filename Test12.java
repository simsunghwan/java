package Test;

public class Test12 {
	public static void main(String args[]) {
		/*
		덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는
		문자열 배열 quiz가 매개변수로 주어집니다.
		수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 
		return하도록 solution 함수를 완성해주세요.
		*/
		String quiz[] = new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		
		
		String[] answer = new String[quiz.length];
		String str = "";
		String ope = "";
		int count = 0;
		int X = 0;
		int Y = 0;
		int Z = 0;
		
		for(int i = 0; i < quiz.length; i++) {
			count = 0;
			for (int j = 0;j < quiz[i].length();j++) {
				if(quiz[i].charAt(j) == ' ') {
					count++;
					if (count == 1) {
						X = Integer.parseInt(str);
					}	
					if (count == 2) {	
						ope = str;
					}
					if (count == 3) {
						Y = Integer.parseInt(str);
					}
					str="";
				} else {
					str += quiz[i].charAt(j);
				}

			}
			Z = Integer.parseInt(str);
			str = "";
			if (ope.equals("+")) {
				answer[i] = X + Y == Z ? "O" : "X";
			} else {
				answer[i] = X - Y == Z ? "O" : "X";
			}
				
		}


	}
}
