package Stack_Queue;

import java.util.*;

public class 후위식연산 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next();
		    System.out.println(solution(input1));
		    return ;
		  }

	private static int solution(String input1) {
		int answer=0;
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < input1.length(); i++) {
			if(Character.isDigit(input1.charAt(i)))
			stack.push(input1.charAt(i)+"");
			else {
				int first = Integer.parseInt(stack.pop()+"");
				int second = Integer.parseInt(stack.pop()+"");
				String method = input1.charAt(i)+"";
				int result = result(first,second,method);
				answer=result;
				stack.push(result+"");
			}
			
		}
		
		
		
		return answer;
	}

	private static int result(int first, int second, String method) {
		if(method.equals("+")) {
			return first+second;
		}else if(method.equals("*")) {
			return first*second;
		}else if(method.equals("/")) {
			return second/first;
		}else if(method.equals("-")) {
			return second-first;
		}
		return 0;
	}
}
