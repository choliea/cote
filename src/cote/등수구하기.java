package cote;
/*
 * N명의 학생의 국어점수가 입력되면 
각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다
 */
import java.util.Scanner;

public class 등수구하기 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[][] arr = new int[input1][2];
		    int[][] arrClone = new int[input1][2];
		    for (int i = 0; i < arr.length; i++) {
		    	int a = in.nextInt();
				arr[i][0] = a;
				arrClone[i][0] = a;
			}
		    for (int i = 0; i < arr.length-1; i++) {
		    	int count = 0;
				for (int j = 0; j < arr.length-i-1; j++) {
					if(arr[j][0]<arr[j+1][0]) {
						int temp = arr[j][0];
						arr[j][0] = arr[j+1][0];
						arr[j+1][0] = temp;
						count++;
					}
				}
				if(count==0)
					break;
			}
		    for (int i = 0; i < arr.length; i++) {//동점 처리 할 부분 
				arr[i][1] = i+1;
				if(i>0&&arr[i][0]==arr[i-1][0]) {
					arr[i][1] = arr[i-1][1];
				}
			}
		    
		    for (int i = 0; i < arrClone.length; i++) {
		    	for (int j = 0; j < arrClone.length; j++) {
		    		if(arr[j][0] ==arrClone[i][0]) {
						System.out.print(arr[j][1]+" ");
						j=arrClone.length;
					}
				}
			}
		    
		    return ;
		  }
}
