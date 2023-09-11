package cote;

public class 외게어사전 {

	public int solution(String[] spell, String[] dic) {
		int answer = 0;
		for (int i = 0; i < dic.length; i++) {
			boolean b = true;
			for (int j = 0; j < spell.length; j++) {
				if(dic[i].length()-1!=dic[i].replace(spell[j], "").length()) {
					b=false;
					break;
				}
			}
			if(b)return 1;
		}
		return 2;
	}

	public static void main(String[] args) {
		String[] a = { "z", "d", "x" };
		String[] d = { "def", "dww", "dzx", "loveaw" };
		System.out.println(new 외게어사전().solution(a, d));
	}
}
