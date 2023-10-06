package cote;

public class 카펫 {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //brown+yellow = return[0]*return[1]
        //yellow의 약수 (2,1)이라하면 약수 세트 가로와 세로에 각각 2씩 더한 값이 리턴
        for(int i=1; i*i<=yellow;i++){
            if(yellow%i==0){
                int r = i;
                int l = yellow/i;
                if((r+2)*(l+2)==brown+yellow){
                    answer[0] = Math.max(r+2,l+2);
                    answer[1] = Math.min(r+2,l+2);
                    return answer;
                }
            }
        }
        return answer;
    }
}
