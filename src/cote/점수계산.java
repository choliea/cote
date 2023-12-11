package cote;

import java.util.Scanner;

//맞으면 1점 틀리면 0점 연속해서 맞으면 연속한만큼+ 
//ex 1번=1 2번연속=2 3연속=3 ... 
//n 입력받고 n번 1,0,배열 입력 받고 총합 출력
public class 점수계산 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[] list = new int[input1];
		    for (int i = 0; i < input1; i++) {
				list[i] = in.nextInt();
			}
		    int sum = 0;
		    int count = 0;
		    for (int i = 0; i < list.length-1; i++) {
		    	if(list[i]==1) {
		    		sum+=++count;
		    		if(list[i+1]==0) {
		    			count=0;
		    		}
		    	}
			}
		    if(list[list.length-1]==1)
		    	sum+=++count;
		    System.out.println(sum);
		    return ;
		  }
}
