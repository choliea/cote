package cote;

import java.util.*;
import java.util.Map.Entry;

public class 저주의숫자3 {

	  public int solution(int n) {
	        int answer = 1;
	        int count = 1;
	        do{
	            if((answer+"").contains("3")||answer%3==0){
	                answer= answer+ 1;//하고 나서도 다시 체크
	                count--;
	            }else{
	            	if(count==n)break;
	                answer = answer+1;
	            }
	            
	            count++;
	        }while(count<=n);
	        return answer;
	    }
	  public int solution2(int n) {
		  int answer = 0;
		  for(int i=0; i<n; i++) {
			  answer++;
			  if((answer+"").contains("3")||answer%3==0)i--;
		  }
		  return answer;
	  }

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4 };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new 저주의숫자3().solution2(15));
	}
}
