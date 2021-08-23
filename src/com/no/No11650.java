package com.no;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11650 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
    	int CountA = Integer.parseInt(br.readLine());
		int[][] a= new int[CountA][2];
		for (int i = 0; i < CountA; i++) {
			StringTokenizer str= new StringTokenizer(br.readLine());
			a[i][0] = Integer.parseInt(str.nextToken());
			a[i][1] = Integer.parseInt(str.nextToken());
		}
		//sort을 a를 먼저하고 a값이 전후랑 같을때만 다시 b를 sort
		Arrays.sort(a, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<CountA;i++)
			sb.append(a[i][0]+" "+a[i][1]).append('\n');
		System.out.println(sb);
	}
	


}
