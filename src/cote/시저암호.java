package cote;

import java.util.*;
import java.util.Map.Entry;

public class 시저암호 {

	public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))&&s.charAt(i)+n>'z') {
            	char temp=(char) (s.charAt(i)-26+n);
            	answer+=temp;
            }else if(Character.isUpperCase(s.charAt(i))&&s.charAt(i)+n>'Z') {
            	char temp = (char) (s.charAt(i)-26+n);
            	answer+=temp;
            }else if(s.charAt(i)==' '){
            	answer+=" ";
            }else {
            	char temp = (char)(s.charAt(i)+n);
            	answer+=temp;
            }
            
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] park = { "sun", "bed", "car" };
		int[] routes = {-2, 3, 0, 2, -5};
		int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		String answer= new 시저암호().solution("AB",1);
		//for (int i = 0; i < answer.length; i++) {
			System.out.print(answer + " ");
		//}
	}
}
