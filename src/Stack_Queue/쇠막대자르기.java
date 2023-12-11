package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

	private static int solution(String str) {
		int count = 0;
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < str.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(str.charAt(i) + "");
			} else if (str.charAt(i - 1) == '(' && str.charAt(i) == ')') {
				stack.pop();
				count += stack.size();
			} else if (str.charAt(i - 1) == ')' && str.charAt(i) == ')') {
				count++;
				stack.pop();
			} else if (str.charAt(i) == '(') {
				stack.push(str.charAt(i) + "");
			}
		}

		return count;
	}
}
