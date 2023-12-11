 package Set_Map;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next();
		    String input2 = in.next();
		    System.out.println(solution(input1,input2));
		    return ;
		  }

	private static String solution(String input1, String input2) {
		String answer = "NO";
		HashMap<Character, Integer> map1 = mapping(input1);
		HashMap<Character, Integer> map2 = mapping(input2);
		if(map1.equals(map2)) {
			answer="YES";
		}
		return answer;
	}

	private static HashMap<Character, Integer> mapping(String input1) {
		HashMap<Character,Integer> answer = new HashMap<Character,Integer>();
		for (int i = 0; i < input1.length(); i++) {
			answer.put(input1.charAt(i), answer.getOrDefault(input1.charAt(i), 0)+1);
		}
		return answer;
	}
}
