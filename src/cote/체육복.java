package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 체육복 {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		ArrayList<Integer> lostList = new ArrayList<Integer>();
		for (int i = 0; i < lost.length; i++) {
			lostList.add(lost[i]);
		}
		ArrayList<Integer> reserveList = new ArrayList<Integer>();
		for (int i = 0; i < reserve.length; i++) {
			reserveList.add(reserve[i]);
		}
		for (int i = 0; i < lostList.size(); i++) {
			Integer lostMemberNo = lostList.get(i);
			if (reserveList.indexOf(lostMemberNo) != -1) {
				reserveList.remove(reserveList.indexOf(lostMemberNo));
				lostList.remove(i--);
			}
		}
		for (int i = 0; i < lostList.size(); i++) {
			Integer lostMemberNo = lostList.get(i);
			Integer beforeLostMember = lostMemberNo - 1;
			Integer afterLostMember = lostMemberNo + 1;
			if (beforeLostMember > 0 && reserveList.indexOf(beforeLostMember) != -1) {
				reserveList.remove(reserveList.indexOf(beforeLostMember));
				lostList.remove(i--);
			} else if (afterLostMember <= n && reserveList.indexOf(afterLostMember) != -1) {
				reserveList.remove(reserveList.indexOf(afterLostMember));
				lostList.remove(i--);
			}
		}
		answer = n - lostList.size();
		return answer;
	}

	public static void main(String[] args) {
		int[] lost = { 2, 3, 4 };
		int[] reverse = { 3, 4, 5 };
		String[] routes = { "AGZ", "BSSS" };
		String[] goal = { "ASA", "BGZ" };
		int answer = new 체육복().solution(5, lost, reverse);
		// for (int i = 0; i < answer.length; i++) {
		System.out.print(answer + " ");
		// }
	}
}
