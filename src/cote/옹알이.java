package cote;

public class 옹알이 {
	static class Solution {
	    public static int solution(String[] babbling) {
	        int answer = 0;
	        //발음가능한거 다 한번씩 replace해서 마지막에 ""나오면 ok 
	        String[] possible = {"aya","ye","woo","ma"};
	        for(int i =0; i<babbling.length; i++){
	            for(int j =0; j<possible.length; j++){
	            	if(babbling[i].contains(possible[j]))
	            		babbling[i]=babbling[i].replaceFirst(possible[j], " ");
	            }
	            if(babbling[i].equals(" ")||
	            		babbling[i].equals("  ")||
	            		babbling[i].equals("   ")||
	            		babbling[i].equals("    ")||
	            		babbling[i].equals("     ")){
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		int a = Solution.solution(babbling);
		System.out.println(a);
	}

}
