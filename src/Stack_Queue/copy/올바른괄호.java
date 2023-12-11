package Stack_Queue.copy;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next();
		    String answer=solution(input1);
		    System.out.println(answer);
		    return ;
		  }

	private static String solution(String input1) {
		String answer="YES";
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < input1.length(); i++) {
			if(input1.charAt(i)=='(') {
				stack.push("(");
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		return answer;
	}
}
