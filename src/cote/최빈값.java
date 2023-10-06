package cote;

public class 최빈값 {
	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        //첫번째꺼랑 다음거 비교해서 같으면 count 증가 
	        //다르면 temp에 저장하고 count =0 
	        //다른거 다시 만났을 때 temp랑 count 비교해서 큰거 temp에 저장 
	        //다 돌고 temp = answer 
	        int temp=0;
	        int count = 0;
	        int a= 0;
	        int count1 = 0;
	        
	        for (int i = 0; i < array.length-1; i++) {
				if(array[i]==array[i+1]) {
					count++;
				}else {
					if(temp<count) {
					temp = count;
					a=i;
					}
					else if(temp==count) {
						count1++;//마지막까지 돌았을때... 같으면 -1 아니면 -1로 하면 안됨 ... 
						
					}
					count=0;
				}
			}
	        if(count1==1)
	        	answer = temp;
	        else
	        	answer = array[a];
	        return answer;
	        
	        
	    }
	}
}
