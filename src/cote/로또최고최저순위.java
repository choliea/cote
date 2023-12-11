package cote;

import java.util.HashSet;
import java.util.Set;

public class 로또최고최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < lottos.length; i++) {
			if(lottos[i]==0)zeroCount++;
			else {
				set.add(lottos[i]);
			}
		}
        int nonZeroCount = 6-zeroCount;
        for (int i = 0; i < win_nums.length; i++) {
			set.add(win_nums[i]);
		}
        answer[1] = 7-(6+nonZeroCount-set.size());
        answer[0] = 7-(6+nonZeroCount-set.size() + zeroCount);
        if(answer[1]>=7)answer[1] = 6;
        if(answer[0]>=7)answer[0] = 6;
        return answer;
    }
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] winNums = {31, 10, 45, 1, 6, 19};
		int[] answer = new 로또최고최저순위().solution(lottos, winNums);
		System.out.println(answer[0]+" "+answer[1]);
	}
}
