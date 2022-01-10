package com.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CodeupLast {
	static boolean find;
	 public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int[][] map = new int[10][10];
		 String[] brmap = new String[10];
		 for(int col=0;col<10;col++)
		 {
			 brmap[col]=br.readLine();
			 StringTokenizer st = new StringTokenizer(brmap[col], " ") ;
			 for(int row=0;row<10;row++)
			 {				 
				 map[col][row]=Integer.parseInt(st.nextToken());
			 }
		 }
		 findAntFood(map, 1, 1);
		 
		 StringBuilder sb= new StringBuilder();
		 for(int col=0;col<10;col++)
		 {
			 for(int row=0;row<10;row++)
			 {
				sb.append(map[col][row]).append(" ");
			 }
			sb.append('\n');
		 }
		 System.out.println(sb);
	 }
//	 탐색 시작 좌표는 (1,1) 오른쪽 우선이동 막히면 아래로 이동 막히면 멈춤 혹은 먹이(2)를 만나면 멈춤
	 
	 
	public static void findAntFood(int[][] map,int col,int row) {
//		오른쪽 부터 체크
		while(!find) {
			while(true)
			{
			map[col][row]=9;
			if(map[col][row+1]==0)
			{		
				row++;
				break;
			}else if(map[col+1][row]==0)
			{
				col++;		
				break;
			}else if(map[col][row+1]==2||map[col+1][row]==2||
					(map[col][row+1]==1&&map[col+1][row]==0))
			{
				find=true;
				if(map[col][row+1]==2)
				{
					map[col][row+1]=9;
					break;
				}
				else if(map[col+1][row]==2)
				{
					map[col+1][row]=9;
					break;
				}
			}
			}
		}
	}
}

