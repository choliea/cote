package Set_Map;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    String input2 = in.next();
		    System.out.println(solution(input1,input2));
		    return ;
		  }

	private static char solution(int input1, String input2) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < input2.length(); i++) {
			map.put(input2.charAt(i),map.getOrDefault((Character)(input2.charAt(i)),0)+1);
		}
		int max =0;
		char maxChar = 'A';
		for (Character i = 'A'; i < 'F'; i++) {
			if(map.get(i)>max) {
				max=map.get(i);
				maxChar=i;
			}
		}
		return maxChar;
	}
}
