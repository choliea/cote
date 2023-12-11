package cote;

import java.util.ArrayList;
import java.util.Scanner;

public class 격자판최대합 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[][] arr = new int[input1][input1];
		    for (int i = 0; i < input1; i++) {
				for (int j = 0; j < input1; j++) {
					arr[i][j] = in.nextInt();
				}
			}
		    ArrayList<Integer> sums = new ArrayList<Integer>();
		    for (int i = 0; i < arr.length; i++) {
		    	int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					sum+=arr[i][j];
				}
				sums.add(sum);
			}
		    for (int i = 0; i < arr.length; i++) {
				int sum = 0;
				for (int j = 0; j < arr.length; j++) {
					sum+=arr[j][i];
				}
				sums.add(sum);
			}
		    int sum =0;
		    for (int i = 0; i < arr.length; i++) {
				sum+=arr[i][i];
			}
		    sums.add(sum);
		    sum=0;
		    for (int i = 0; i < arr.length; i++) {
				sum+=arr[i][arr.length-i-1];
			}
		    sums.add(sum);
		    int max = 0;
		    for (int i = 0; i < sums.size(); i++) {
				max=Math.max(max, sums.get(i));
			}
		    System.out.println(max);
		    return ;
		  }
}
