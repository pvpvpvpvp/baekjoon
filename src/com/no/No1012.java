package com.no;

import java.util.Scanner;

public class No1012
 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int caseCount =sc.nextInt();//배열의 개수
		
		for (int i = 0; i < caseCount; i++) {
			int caserow = sc.nextInt();
			int casecal = sc.nextInt();
	
			int[][][] caseDis = new int[caserow][casecal][caseCount]; 
			int countS = sc.nextInt();
			for (int j = 0; j < countS; j++) {
				int inx = sc.nextInt();
				int iny = sc.nextInt();
				caseDis[inx][iny][i]=1;
			}
			
			

		}
      


		sc.close();
	}
}
