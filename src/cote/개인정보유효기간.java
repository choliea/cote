package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 개인정보유효기간 {
	public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < privacies.length; i++) {
			String yearStr = privacies[i].substring(0, 4);
			String monthStr = privacies[i].substring(5, 7);
			String dayStr = privacies[i].substring(8, 10);
			int year = Integer.parseInt(yearStr);
			int month = Integer.parseInt(monthStr);
			int day = Integer.parseInt(dayStr);
			String termStr = privacies[i].substring(11);
			int term = 0;
			for (int j = 0; j < terms.length; j++) {
				if (terms[j].startsWith(termStr)) {
					term = Integer.parseInt(terms[j].substring(2));
				}
			}
			month = month + term;
			if (month > 12) {
				year++;
				month -= 12;
			}
			day--;
			if (day == 0) {
				month--;
				if (month == 0) {
					year--;
					month = 12;
					day = 31;
				} else if (month == 1) {
					day = 31;
				} else if (month == 2) {
					if (isLuna(year)) {
						day = 29;
					} else {
						day = 28;
					}
				} else if (month == 3) {
					day = 31;

				} else if (month == 4) {
					day = 30;

				} else if (month == 5) {
					day = 31;

				} else if (month == 6) {
					day = 30;

				} else if (month == 7) {
					day = 31;

				} else if (month == 8) {
					day = 31;

				} else if (month == 9) {
					day = 30;

				} else if (month == 10) {
					day = 31;

				} else if (month == 11) {
					day = 30;

				}

			}
			Date pd = new Date();
			String pDate= year+"."+month+"."+day;
			try {
				pd=new SimpleDateFormat("yyyy.MM.dd").parse(pDate);
				Date t = new SimpleDateFormat("yyyy.MM.dd").parse(today);
				if(pd.compareTo(t)<0)
					answer.add(i+1);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return answer;
	}
	public ArrayList<Integer> solution2(String today, String[] terms, String[] privacies) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int tday =Integer.parseInt(today.substring(0,4))*12*28+Integer.parseInt(today.substring(5,7))*28+Integer.parseInt(today.substring(8,10));
			
		for (int i = 0; i < privacies.length; i++) {
			String termStr = privacies[i].substring(11);
			int term = 0;
			for (int j = 0; j < terms.length; j++) {
				if (terms[j].startsWith(termStr)) {
					term = Integer.parseInt(terms[j].substring(2));
				}
			}
			String yearStr = privacies[i].substring(0, 4);
			String monthStr = privacies[i].substring(5, 7);
			String dayStr = privacies[i].substring(8, 10);
			int year = Integer.parseInt(yearStr);
			int month = Integer.parseInt(monthStr);
			int day = Integer.parseInt(dayStr);
			month = month + term;
			int n = day+month*28+year*28*12;
			if(n<=tday)
			answer.add(i+1);
		}
		return answer;
	}

	private boolean isLuna(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws ParseException {
		int[] park = { 2, 1, 2, 6, 2, 4, 3, 3 };
		String[] routes = { "Z 3", "D 5" };
		String[] goal = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		ArrayList<Integer> answer = new 개인정보유효기간().solution("2022.05.19", routes, goal);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}
