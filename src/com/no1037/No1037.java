package com.no1037;

import java.util.Scanner;

public class No1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int CountA= sc.nextInt();
		int[] a= new int[CountA];
		for(int i=0;i<CountA;i++)
		{
			a[i]=sc.nextInt();
		}
		// ex 16
		int s=1;
		for(int i=0;i<CountA;i++)
		{
			s*=a[i];
		}
		
		for(int i=0;i<CountA;i++)
		{
			int ss=s;
		}
	}

}
