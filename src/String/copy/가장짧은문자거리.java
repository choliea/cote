package String.copy;
import java.util.Scanner;
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가
//문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//teachermode e 입력
//1 0 1 2 1 0 1 2 2 1 0 출력
public class 가장짧은문자거리 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    String input2 = in.next();
	    int[] answer =solution(input1,input2);
	    for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	    return ;
	  }

	private static int[] solution(String input1,String input2) {
		String[] arr = input1.split(input2);
		char[] list = input1.toCharArray();
		int[] answer= new int[list.length];
		int arrCount = 0;
		int answerCount=1000;
		for (int i = 0; i < answer.length; i++) {
			if(String.valueOf(list[i]).equals(input2)) {
				answer[i]=0;
				answerCount=1;
			}else {
				answer[i]=answerCount++;
			}
		}
		for (int i = answer.length-1; i >=0; i--) {
			if(String.valueOf(list[i]).equals(input2)) {
				answer[i]=0;
				answerCount=1;
			}else {
				answer[i]=Math.min(answer[i],answerCount++);
			}
		}
		
		return answer;
	}
}
