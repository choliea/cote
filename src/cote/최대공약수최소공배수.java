package cote;

import java.util.*;
import java.util.Map.Entry;

public class 최대공약수최소공배수 {

	  public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        answer[0]= GCD(n,m);
	        answer[1] =n*m/ GCD(n,m);
	        return answer;
	    }
	  int GCD(int a, int b) {
		  if(a%b==0)return b;
		  else return GCD(b,a%b);
	  }
	public static void main(String[] args) {
		String[] park = { "sun", "bed", "car" };
		int[] routes = {1, 5, 2, 6, 3, 7, 4};
		int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer= new 최대공약수최소공배수().solution(3,12);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
