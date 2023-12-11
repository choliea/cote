package cote;

import java.util.Scanner;

public class 봉우리 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[][] arr = new int[input1+2][input1+2];
		    for (int i = 1; i <=input1; i++) {
				for (int j = 1; j <=input1; j++) {
					arr[i][j] = in.nextInt();
				}
			}
		    int count =0;
		    for (int i = 1; i <=input1; i++) {
		    	for (int j = 1; j <=input1; j++) {
		    		boolean isHighest=true;
		    		if(arr[i][j]<=arr[i-1][j]||arr[i][j]<=arr[i][j+1]||arr[i][j]<=arr[i+1][j]||arr[i][j]<=arr[i][j-1]) {
		    			isHighest=false;
		    		}
		    		if(isHighest) {
		    			count++;
		    		}
		    	}
		    }
		    
		    
		    System.out.println(count);
		    return ;
		  }
}
