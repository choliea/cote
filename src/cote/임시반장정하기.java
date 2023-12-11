package cote;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 임시반장정하기 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[][] square = new int[input1][5];
		    for (int i = 0; i < square.length; i++) {
				for (int j = 0; j < 5; j++) {
					square[i][j] = in.nextInt();
				}
			}
		    int[] answer = new int[input1];
		    int count= 0;
		    int studentNo = 0;
		    int max = 0;
		    int maxIndex = 0;
		    for (int k = 0; k < input1; k++) {
		    	HashSet<Integer> meet = new HashSet<Integer>();
		    	for (int j = 0; j < square[0].length; j++) {
					for (int i = 0; i < square.length; i++) {
						//i번학생 j학년 
						if(k!=i&&square[k][j]==square[i][j]) {
							meet.add(i);
						}
					}
				}
		    	if(max<meet.size()) {
		    		max=meet.size();
		    		maxIndex=k;
		    	}
			}
		    
		    System.out.println(maxIndex+1);
		    return ;
		  }
}
