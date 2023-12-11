package Stack_Queue.copy;

import java.util.*;

public class 교육과정설계 {
	public static void main(String[] args){
		   Scanner in=new Scanner(System.in);
		   String input1 = in.next();
		   String input2 = in.next();
		   System.out.println(solution(input1,input2));
		   return ;
		 }

	private static String solution(String input1, String input2) {
		int ptr=0;
		for (int i = 0; i < input2.length(); i++) {
			if(ptr>input1.length()-1) {
				return "YES";
			}
			if(input1.charAt(ptr)==input2.charAt(i)) {
				ptr++;
			}
		}
		
		return "NO";
	}
}
