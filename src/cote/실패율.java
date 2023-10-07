package cote;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 실패율 {

	public ArrayList<Integer> solution(int N, int[] stages) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] current = new int[N+1];
		for (int i = 0; i < stages.length; i++) {
			for (int j = 0; j < stages[i]; j++) {
				current[j]++;
			}
		}
		double[] failure = new double[N];
		for (int i = 0; i < failure.length; i++) {
			if(current[i]==0)failure[i]=0.0;
			else failure[i] = (0.0+current[i]-current[i+1])/current[i];
		}
		Map<Double,ArrayList<Integer>> failureMapR = new HashMap<Double, ArrayList<Integer>>();
		for (int i = 0; i < failure.length; i++) {
			ArrayList<Integer> list = failureMapR.getOrDefault(failure[i], new ArrayList<Integer>());
			list.add(i+1);
			failureMapR.put(failure[i], list);
		}
		Arrays.sort(failure);
		for (int i = failure.length-1; i >=0; i--) {
			ArrayList<Integer> temp = failureMapR.get(failure[i]);
			for (int j = 0; j < temp.size(); j++) {
				answer.add(temp.get(j));
			}
			temp.removeAll(temp);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] lost = { 1,1,1,2,3,4 };
		int[] reverse = { 3, 4, 5 };
		String[] routes = { "AGZ", "BSSS" };
		String[] goal = { "ASA", "BGZ" };
		ArrayList<Integer> answer = new 실패율().solution(5, lost);
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
	}
}
