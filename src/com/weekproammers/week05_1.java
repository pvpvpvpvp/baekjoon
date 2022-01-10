package com.weekproammers;

public class week05_1 {
	static int count=0;
	static int result=0;
	static boolean active;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="UUUUU";
		System.out.println(re("",word));
	}
	
	public static int re(String i,String word) {
		if(active)
			return result;
		String[] st= {"A","E","I","O","U"};
		for(String j:st)
		{
			count++;
			System.out.println(i+j+" "+(i+j).equals(word));
			if((i+j).equals(word))
			{
				active=true;
				return result=count;
			}
			if(i.length()<4)
			re(i+j,word);	
		}
		return result;
	}
}
