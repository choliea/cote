package cote;

import java.util.ArrayList;

public class 다트게임 {
	public int solution(String dartResult) {
		int answer = 0;
		char[] arr = dartResult.toCharArray();
		ArrayList<Integer> scoreList = new ArrayList<>();
		for (int i=-0; i<arr.length;i++) {
			if(Character.isDigit(arr[i])&&!Character.isDigit(arr[i+1])) {
				scoreList.add(Integer.parseInt(arr[i]+""));
			}else if(Character.isDigit(arr[i])) {
				scoreList.add(Integer.parseInt(arr[i]+""+arr[i+1]));
				i++;
			}else if(arr[i]=='D') {
				int score =scoreList.get(scoreList.size()-1);
				score = score*score;
				scoreList.remove(scoreList.size()-1);
				scoreList.add(score);
			}else if(arr[i]=='T') {
				int score = scoreList.get(scoreList.size()-1);
				score = score*score*score;
				scoreList.remove(scoreList.size()-1);
				scoreList.add(score);
			}else if(arr[i]=='*') {
				int score = scoreList.get(scoreList.size()-1);
				score = 2*score;
				scoreList.remove(scoreList.size()-1);
				scoreList.add(score);
				if(scoreList.size()>=2) {
					int pscore = scoreList.get(scoreList.size()-2);
					pscore = 2*pscore;
					scoreList.remove(scoreList.size()-2);
					scoreList.add(scoreList.size()-1, pscore);
				}
			}else if(arr[i]=='#') {
				int score = scoreList.get(scoreList.size()-1);
				score = -1*score;
				scoreList.remove(scoreList.size()-1);
				scoreList.add(score);
			}
		}
		for (Integer integer : scoreList) {
			answer+=integer;
		}
		return answer;
	}
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		System.out.println(new 다트게임().solution(dartResult));
	}
}
