package cote;

import java.math.BigInteger;

public class 분수의덧셈 {
	class Solution {
	    public int[] solution(int numer1, int denom1, int numer2, int denom2) {//분자=numer
	        int[] answer = {};
	        int a = (numer1*denom2+numer2*denom1);
	        int b = (denom1*denom2);
	        BigInteger numer = BigInteger.valueOf(a);
	        BigInteger denom = BigInteger.valueOf(b);
	        BigInteger gcd = numer.gcd(denom);
	        int gcdd = gcd.intValue();
	        	int	c=numer.intValue()/gcdd;
	        	int d =denom.intValue()/gcdd;
	        answer = new int[]{c, d};
	        
	        return answer;
	        
	        //1부터 두 값중의 최솟값 까지 분모와 분자의 수를 나누었을 때 나머지가 없는 경우를 만족한 수중 가장 큰 수 =최대공약수
	        
	    }
	}
}
