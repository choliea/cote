package cote;

import java.util.Scanner;
/*
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 */
public class 소수_에라토스테네스체 {
	  
	  public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    System.out.println(solution(input1));
	    return ;
	  }

	private static int solution(int input1) {
		int answer = 1;
		for (int i = 3; i <= input1; i+=2) {
			boolean issosu = true;
			for (int j =2; j*j <= i; j++) {
				if(i%j==0) {
					issosu = false;
					break;
				}
			}
			if(issosu) {
				answer++;
			}
		}
		return answer;
	}
}
