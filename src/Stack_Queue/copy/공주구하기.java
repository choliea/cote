package Stack_Queue.copy;

import java.util.*;

public class 공주구하기 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();//인원수
		    LinkedList<Integer> link = new LinkedList<Integer>();
		    int input2 = in.nextInt();//턴횟수
		    for (int i = 1; i <= input1; i++) {
				link.offer(i);
			}
		    System.out.println(solution(input2,link));
		    
		    return ;
		  }

	private static int solution(int input2, LinkedList<Integer> link) {
		while (link.size()>1) {
			for(int j=0;j<input2-1;j++)
			link.offer(link.poll());
			link.poll();
		}
		
		return link.peek();
	}
}
