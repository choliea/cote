package cote;

import java.util.*;
import java.util.Map.Entry;

public class 삼총사 {
/*큐에 1번 2번 3번
 * 3번 빼고 4번 
 * ...
 * 2번 빼고 3번 
 * 
 *  스택이라면 
 *  1 2 3
 *  3빼고 4  굿 
 */
	  public int solution2(int[] number) {
	        int answer = 0;

	        for(int i=0; i<number.length-2; i++){
	            for(int j=i+1; j<number.length-1; j++){
	                for(int k=j+1; k<number.length; k++){
	                    if(number[i]+number[j]+number[k]==0) answer++;
	                }
	            }
	        }

	        return answer;
	    }
	public int solution(int[] number) {
		int answer=0;
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		int fi = 0;
		int si = 1;
		int li = 2;
		while(fi<=number.length-3) {
			sum+=stack.push(number[fi]);
			while(si<=number.length-2) {
				sum+=stack.push(number[si]);
				while(li<=number.length-1) {
					sum+=stack.push(number[li]);
					if(sum==0)answer++;
					sum-=stack.pop();
					li++;
				}
				if(li==number.length) {
					sum-=stack.pop();
					si++;
					li=si+1;
				}
			}
			if(si==number.length-1) {
				sum-=stack.pop();
				fi++;
				si=fi+1;
				li=si+1;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		String[] park = { "sun", "bed", "car" };
		int[] routes = {-2, 3, 0, 2, -5};
		int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int answer= new 삼총사().solution(routes);
		//for (int i = 0; i < answer.length; i++) {
			System.out.print(answer + " ");
		//}
	}
}
