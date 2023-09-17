package cote;

import java.util.*;
import java.util.Map.Entry;

public class 치킨쿠폰 {

	public int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;
		answer = R(coupon,answer);
		return answer;
	}
	private int R(int coupon, int answer) {
		int chicken = coupon/10;
		answer+=chicken;
		coupon-=chicken*10;
		coupon+=chicken;
		if(coupon>=10) {
			return R(coupon,answer);
		}
		return answer;
	}
	 public int solution2(int chicken) {
	        int coupon = chicken;
	        int answer = 0;
	        while (coupon >= 10) {
	        	answer += coupon / 10;
	            coupon = coupon % 10 + coupon / 10;
	        }
	        return answer;
	    }

	  public int solution3(int chicken) {
	        int answer = chicken/9;
	        if(chicken>1&&chicken%9==0){
	            answer--;
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4 };
		String[] d = { "3 - 4 = -3", "5 + 6 = 11", "-19 - 6 = 13", "-5 + 66 = -71", "5 - 15 = 63", "3 - 1 = -2" };
		System.out.println(new 치킨쿠폰().solution2(1081));
	}
}
