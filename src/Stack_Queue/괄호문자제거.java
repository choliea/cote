package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input = in.next();
	    
	    System.out.println(solution(input));
	    return ;
	  }

	private static String solution(String input) {
		Stack<String> stack = new Stack<String>();
		String answer ="";
		for (int i = 0; i < input.length(); i++) {
			if(stack.isEmpty()&&Character.isAlphabetic(input.charAt(i))) {
				answer+=input.charAt(i);
			}else if(input.charAt(i)=='(') {
				stack.push(input.charAt(i)+"");
			}else if(input.charAt(i)==')') {
				stack.pop();
			}else if(!stack.isEmpty()&&Character.isAlphabetic(input.charAt(i))) {
				continue;
			}
		}
		return answer;
	}
}
