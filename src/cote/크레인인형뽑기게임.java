package cote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 크레인인형뽑기게임 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0)
					continue;
				ArrayList<Integer> temp = map.getOrDefault(j, new ArrayList<Integer>());
				temp.add(board[i][j]);
				map.put(j, temp);
			}
		}

		ArrayList<Integer> stack = new ArrayList<>();
		for (int i = 0; i < moves.length; i++) {
			if (map.get(moves[i] - 1).size() != 0) {
				ArrayList<Integer> temp = map.get(moves[i] - 1);
				if (stack.size() > 0 && stack.get(stack.size() - 1) == temp.get(temp.size() - 1)) {
					answer += 2;
					stack.remove(stack.size() - 1);
				} else {
					stack.add(temp.get(temp.size() - 1));
				}
				temp.remove(temp.size() - 1);
				map.put(moves[i] - 1, temp);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(new 크레인인형뽑기게임().solution(board, moves));
	}
}
