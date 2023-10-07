package cote;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class year2016 {

public String solution3(int a, int b) {
	  return LocalDate.of(2016, a, b).getDayOfWeek().toString();
}
	public String solution2(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
	public String solution(int a, int b) {
		String answer = "FRI";
		int dayAfter = 0;
		if(a==1) {
			dayAfter=b-1;
		}else if(a==2) {
			dayAfter=31+b-1;
		}else if(a==3) {
			dayAfter=31+29+b-1;
		}else if(a==4) {
			dayAfter=31+29+31+b-1;
		}else if(a==5) {
			dayAfter=31+29+31+30+b-1;
		}else if(a==6) {
			dayAfter=31+29+31+30+31+b-1;
		}else if(a==7) {
			dayAfter=31+29+31+30+31+30+b-1;
		}else if(a==8) {
			dayAfter=31+29+31+30+31+30+31+b-1;
		}else if(a==9) {
			dayAfter=31+29+31+30+31+30+31+31+b-1;
		}else if(a==10) {
			dayAfter=31+29+31+30+31+30+31+31+30+b-1;
		}else if(a==11) {
			dayAfter=31+29+31+30+31+30+31+31+30+31+b-1;
		}else if(a==12) {
			dayAfter=31+29+31+30+31+30+31+31+30+31+30+b-1;
		}
		if(dayAfter%7==1) {
			return "SAT";
		}
		if(dayAfter%7==2) {
			return "SUN";
		}
		if(dayAfter%7==3) {
			return "MON";
		}
		if(dayAfter%7==4) {
			return "TUE";
		}
		if(dayAfter%7==5) {
			return "WED";
		}
		if(dayAfter%7==6) {
			return "THU";
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] park = { "you", "smarter" };
		String[] routes = { "think", "more", "will", "be" };
		String[] goal = { "think", "more", "you", "will", "be", "smarter" };
		String answer = new year2016().solution3(8, 1);
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		// }
	}
}
