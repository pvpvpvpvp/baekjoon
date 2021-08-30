package com.weekproammers;

public class week05 {
	 //미리 모든 경우의 수를 구할 경우 가능한 숏코딩
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int answer = 0, per = 3905;
		 String word= "EIOA";
		for(String s : word.split(""))  //word를 하나씩 빼서
		{
			System.out.print("AEIOU".indexOf(s)+" ");
			System.out.println(s);
			answer += "AEIOU".indexOf(s) * (per /= 5) + 1; //answer 에 AEIOU 순서의 인덱스와 같은 s의 정수값*(모든 경우의 수/=5 [n번째 자리에서의 경우의수 n이 +1될때마다 /5으로 줄어든다] )
//																+1[값 보정]
		}
		System.out.println(answer);
	}

}
