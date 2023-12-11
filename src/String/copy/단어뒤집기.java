package String.copy;
import java.util.Scanner;

public class 단어뒤집기 {
	 public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int input1 = in.nextInt();
		    String[] strArr = new String[input1];
		    for (int i = 0; i < strArr.length; i++) {
		    	strArr[i] = in.next();
			}
		    String[] answer=solution(strArr);
		    for (int i = 0; i < answer.length; i++) {
		    	System.out.println(answer[i]);
			}
		    return ;
		  }
	private static String[] solution(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			char[] list = strArr[i].toCharArray();
			for (int j = 0; j < list.length/2; j++) {
				char temp =list[j];
				list[j] = list[list.length-j-1];
				list[list.length-j-1]=temp;
			}
			strArr[i] =String.valueOf(list);
		}
		return strArr;
	}
}
