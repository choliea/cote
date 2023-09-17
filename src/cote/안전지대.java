package cote;

import java.util.*;

public class 안전지대 {

	 public int solution(int[][] board) {
	        int answer = 0;
	        for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if(board[i][j]==1) {
						if(j>0)board[i][j-1]=danger(board[i][j-1]);
						if(j!=board.length-1)board[i][j+1]=danger(board[i][j+1]);
						if(i>0&&j>0)board[i-1][j-1]=danger(board[i-1][j-1]);
						if(i>0&&j!=board.length-1)board[i-1][j+1]=danger(board[i-1][j+1]);
						if(j>0&&i!=board.length-1)board[i+1][j-1]=danger(board[i+1][j-1]);
						if(j!=board.length-1&&i!=board.length-1)board[i+1][j+1]=danger(board[i+1][j+1]);
						if(i!=board.length-1)board[i+1][j]=danger(board[i+1][j]);
						if(i>0)board[i-1][j]=danger(board[i-1][j]);
					}
				}
			}
	        for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if(board[i][j]==0)answer++;
				}
			}
	        return answer;
	    }
	 public int danger(int x) {
		 if(x==1) return 1;
		 else  return 2;
	 }

	 public int solution2(int[][] board) {
	        int answer = 0;
	        int[][] boardEx = new int[board.length+2][board.length+2];
	        for (int i = 1; i <= board.length; i++) {
				for (int j = 1; j <= board.length; j++) {
					boardEx[i][j] = board[i-1][j-1];
				}
			}
	        for (int i = 1; i < boardEx.length; i++) {
				for (int j = 1; j < boardEx[i].length; j++) {
					if(boardEx[i][j]==1) {
						boardEx[i][j-1]=danger(boardEx[i][j-1]);
						boardEx[i][j+1]=danger(boardEx[i][j+1]);
						boardEx[i-1][j-1]=danger(boardEx[i-1][j-1]);
						boardEx[i-1][j+1]=danger(boardEx[i-1][j+1]);
						boardEx[i+1][j-1]=danger(boardEx[i+1][j-1]);
						boardEx[i+1][j+1]=danger(boardEx[i+1][j+1]);
						boardEx[i+1][j]=danger(boardEx[i+1][j]);
						boardEx[i-1][j]=danger(boardEx[i-1][j]);
					}
				}
			}
	        for (int i = 1; i < boardEx.length-1; i++) {
				for (int j = 1; j <boardEx[i].length-1; j++) {
					if(boardEx[i][j]==0)answer++;
				}
			}
	        return answer;
	    }

	public static void main(String[] args) {
		int[][] a = { { 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0 } };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 안전지대().solution2(a));
	}
}
