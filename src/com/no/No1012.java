package com.no;

import java.util.Scanner;

public class No1012 {
	static int re = 0;
	static int[][] array1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int caseCount = sc.nextInt();// 배열의 개수
		int[] a = new int[caseCount];
		for (int i = 0; i < caseCount; i++) {
			int caserow = sc.nextInt();
			int casecal = sc.nextInt();

			int[][] caseDis = new int[caserow][casecal];
			int countS = sc.nextInt(); // 1이 있는 개수 (입력개수)
			for (int j = 0; j < countS; j++) {
				int inx = sc.nextInt();
				int iny = sc.nextInt();
				caseDis[inx][iny] = 1;
			}

			a[i] = findGroup(caseDis, caserow, casecal);
			re = 0;
		}
		for (int i = 0; i < caseCount; i++) {
			System.out.println(a[i]);
		}

		sc.close();
	}

	public static void DFS(int[][] array, int[][] x, int caserow, int casecal, int j, int j2) {
		array1 = array;// 빈배열
		if (array1[j][j2] != 1 && x[j][j2] == 1) { // 조건 새로운배열이 0이여야함 , 그리고 현재 위치가 1이여야함
			array1[j][j2] = 1; //시작할때 새배열에 1찍어두고 사용했다고 표시해둠
			if (j + 1 < caserow && x[j][j2] == x[j + 1][j2] && array1[j + 1][j2] == 0) {
				// 조건 배열을 안넘어가게 caserow보다 작고, 그리고 현재위치랑 아래위치랑 값이 같으면서 (둘다 1이라는뜻) ,그리고 가야되는 위치가 사용되지 않았다면
 				DFS(array1, x, caserow, casecal, j+1, j2); // 아래 위치로 이동해서 검색반복
			}
			if (j2 + 1 < casecal && x[j][j2] == x[j][j2 + 1] && array1[j][j2 + 1] == 0) {				
				DFS(array1, x, caserow, casecal, j, j2+1);
			}
			if (j - 1 >= 0 && x[j][j2] == x[j - 1][j2] && array1[j - 1][j2] == 0) {
				DFS(array1, x, caserow, casecal, j-1, j2);
			}
			if (j2 - 1 >= 0 && x[j][j2] == x[j][j2 - 1] && array1[j][j2 - 1] == 0) {		
				DFS(array1, x, caserow, casecal, j, j2-1);
			}
		}
	}

	public static int findGroup(int[][] x1, int caserow1, int casecal1) {

		array1 = new int[caserow1][casecal1];
		for (int j1 = 0; j1 < caserow1; j1++) {
			for (int j21 = 0; j21 < casecal1; j21++) {
				if (array1[j1][j21] != 1 && x1[j1][j21] == 1) {
					array1[j1][j21] = 1;
					if (j1 + 1 < caserow1 && x1[j1][j21] == x1[j1 + 1][j21] && array1[j1 + 1][j21] == 0) {

						DFS(array1, x1, caserow1, casecal1, j1 + 1, j21);
					}
					if (j21 + 1 < casecal1 && x1[j1][j21] == x1[j1][j21 + 1] && array1[j1][j21 + 1] == 0) {

						DFS(array1, x1, caserow1, casecal1, j1, j21 + 1);
					}
					if (j1 - 1 >= 0 && x1[j1][j21] == x1[j1 - 1][j21] && array1[j1 - 1][j21] == 0) {

						DFS(array1, x1, caserow1, casecal1, j1 - 1, j21);
					}
					if (j21 - 1 >= 0 && x1[j1][j21] == x1[j1][j21 - 1] && array1[j1][j21 - 1] == 0) {

						DFS(array1, x1, caserow1, casecal1, j1, j21 - 1);
					}

					re++;
				}

			}
		}
		return re;
	}

}
