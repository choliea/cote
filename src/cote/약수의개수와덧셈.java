package cote;

import java.util.*;
import java.util.Map.Entry;

public class 약수의개수와덧셈 {

	   public int solution(int left, int right) {
	        int answer = 0;
	        for (int i = left; i <= right; i++) {
				if(primeNum(i)%2==0) {
					answer+=i;
				}else {
					answer-=i;
				}
			}
	        return answer;
	    }
	   public int solution2(int left, int right) {
		   int answer = 0;
		   for (int i = left; i <= right; i++) {
			   if(i%Math.sqrt(i)==0) {
				   answer-=i;
			   }else {
				   answer+=i;
			   }
		   }
		   return answer;
	   }

	   public int primeNum(int num) {
		   int count=0;
		   for (int i = 1; i*i <= num; i++) {
			if(i*i==num)count++;
			else if(num%i==0)count+=2;
		}
		   return count;
	   }
	public static void main(String[] args) {
		String[] park = { "mumu", "soe", "poe", "kai", "mine" };
		String[] routes = { "kai", "kai", "mine", "mine" };
		int answer = new 약수의개수와덧셈().solution(13, 17);
		for (int i = 0; i < answer; i++) {
			System.out.print(answer + " ");
		}
	}
}
