package Stack_Queue.copy;

import java.util.*;

public class 인형뽑기_카카오 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int[][] arr = new int[input1][input1];
	    	for (int i = 0; i < arr.length; i++) {
	    		for (int j = 0; j < arr.length; j++) {
				arr[i][j]=in.nextInt();
			}
		}
	    Stack<Integer>[] square = new Stack[input1];
	    for (int i =0; i <square.length; i++) {
	    	Stack<Integer> stack = new Stack<Integer>();
	    		for (int j = square.length-1; j >=0; j--) {
	    			if(arr[j][i]!=0)
				stack.add(arr[j][i]);
			}
			square[i]=stack;
		}
	    int input2 = in.nextInt();
	    int[] hook = new int[input2];
	    for (int i = 0; i < hook.length; i++) {
			hook[i]=in.nextInt();
		}
	    System.out.println(solution(square,hook));
	    return ;
	  }

	private static int solution(Stack<Integer>[] square, int[] hook) {
		int popCount=0;
		Stack<Integer> popStack = new Stack<Integer>();
		for (int i = 0; i < hook.length; i++) {
			if(!square[hook[i]-1].isEmpty()) {
				int addStack = (Integer)(square[hook[i]-1].pop());
				if(!popStack.isEmpty()&&addStack==popStack.peek()) {
					popStack.pop();
					popCount++;
				}else if(popStack.isEmpty()) {
					popStack.push(addStack);
				}else if(!popStack.isEmpty()) {
					popStack.push(addStack);
				}
			}
		}
		
		return popCount*2;
	}
}
