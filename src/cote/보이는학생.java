package cote;
import java.util.ArrayList;
import java.util.Scanner;
public class 보이는학생 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    ArrayList<Integer> inputList = new ArrayList<Integer>();
	    for (int i = 0; i < input1; i++) {
	    	inputList.add(in.nextInt());
		}
	    ArrayList<Integer> answer = solution(inputList);
	    System.out.println(answer.size());
	    return ;
	  }

	private static ArrayList<Integer> solution(ArrayList<Integer> inputList) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < inputList.size(); i++) {
			if(max<inputList.get(i)) {
				max=inputList.get(i);
				answer.add(inputList.get(i));
			}
		}
		return answer;
	}
}
