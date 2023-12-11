package cote;
import java.util.ArrayList;
import java.util.Scanner;
public class 큰수출력하기 {
	  public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    int[] inputList = new int[input1];
		    for (int i = 0; i < inputList.length; i++) {
				inputList[i] =  in.nextInt();
			}
		    
		    ArrayList<Integer> answer= solution(inputList);
		    for (int i = 0; i < answer.size(); i++) {
				System.out.print(answer.get(i)+" ");
			}
		    return ;
		  }

	private static ArrayList<Integer> solution(int[] inputList) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(inputList[0]);
		for (int i = 1; i < inputList.length; i++) {
			if(inputList[i-1]<inputList[i]) {
			answer.add(inputList[i]);
			}
		}
		
		return answer;
	}
}
