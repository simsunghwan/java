package Test;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
       
        return answer;
    }
}
public class Test1 {
	public static void main (String args[]) {
		int answer = 0;
        String babbling[] = new String[]{"aya", "yee", "u", "maa", "wyeoo"};
        
        for (int i = 0; i < babbling.length; i++) {
        	babbling[i] = babbling[i].replace("aya", "1");
        	babbling[i] = babbling[i].replace("ye", "1");
        	babbling[i] = babbling[i].replace("woo", "1");
        	babbling[i] = babbling[i].replace("ma", "1");
        	babbling[i] = babbling[i].replace("1", "");
        	if(babbling[i] == "") {
        		answer += 1;
        	}
        }
        System.out.println(answer);
 
	}
}
