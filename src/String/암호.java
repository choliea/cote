package String;
import java.util.Scanner;
public class 암호 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    String input2 = in.next();
	    System.out.println(solution(input1,input2));
	    return ;
	  }

	private static String solution(int input1, String input2) {
		input2=input2.replaceAll("#","1");
		input2=input2.replaceAll("\\*","0");
		String answer = "";
		CharSequence[] list = new String[input1];
		int seven=0;
		for (int i = 0; i < input1; i++) {
			int charInt = 0;
			list[i] = input2.substring(0+seven,7+seven);
			int mulNo = 1;
			for (int j= 6; j >=0; j--) {
				charInt+=mulNo*Integer.parseInt(String.valueOf(list[i].charAt(j)));
				mulNo*=2;
			}
			char realChar = (char) charInt;
			answer+= realChar;
			seven+=7;
		}
		return answer;
	}
}
