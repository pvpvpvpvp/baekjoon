package com.weekproammers;

public class week05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int answer = 0, per = 3905;
		 String word= "EIOA";
		for(String s : word.split("")) 
		{
			System.out.print("AEIOU".indexOf(s)+" ");
			System.out.println(s);
			answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
		}
		System.out.println(answer);
	}

}
