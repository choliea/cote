package cote;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 등수매기기 {

	 public int[] solution(int[][] score) {
	        int[] answer = new int[score.length];
	        for(int i=0;i<score.length;i++){
	            for(int j=0; j<score.length;j++){
	                if(score[i][0]+score[i][1]<score[j][0]+score[j][1]){
	                    answer[i]++;
	                }
	            }
	            answer[i]++;
	        }
	        return answer;
	    }

	 public int[] solution2(int[][] score) {
	        List<Integer> scoreList = new ArrayList<>();
	        for(int[] t : score){
	            scoreList.add(t[0] + t[1]);
	        }
	        scoreList.sort(Comparator.reverseOrder());

	        int[] answer = new int[score.length];
	        for(int i=0; i<score.length; i++){
	            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int[][] a = { {80, 70}, {90, 50}, {40, 70}, {50, 80} };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 등수매기기().solution(a));
	}
}
