package com.no;

import java.util.Scanner;

public class No11729 {
//	하노이 탑 문제 해결하기 재귀
	static StringBuilder b =new StringBuilder();
	static int countHanoi=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();

//		재귀 함수에서 print출력시 타임아웃나서 StringBulier사용해서 .append
		hanoi(i, 1, 2, 3);
		System.out.println(countHanoi);
		System.out.println(b);
	}

//	재귀를 위한 함수
//	조건 1. 한번에 한 원판만 이동해야됨.
//	조건 2. 원판이 크기대로 쌓여있는데 작은 원판위에 큰원판을 이동시키면 안됨.
//	조건 3. A의 원판들을 전부 C로 그대로 쌓아야됨.
	
//	생각 1. 하노이는 재귀형태로 해결할 수 있다.
//		최초 원판개수를 n이라고 하자
//		-A에 가장 큰 원판을 C에 넣기 위해서는 B에 A의 n-1개수의 원판을 순서대로 쌓아야한다.
//		이는 B에서 다시 C로 원판을 이동시킬때 가장큰 원판을 이동시킬려면
//		B의 원판개수인 ((n-1)-1))개의 원판을 다시 A로 이동시키고
//		B의 n다음으로 큰 n-1번째 원판을 C로 이동시켜야 한다.
//		이 과정을 n값이 1이 될때까지 반복한다면 규칙에 어긋나지 않는 답을 구할 수 있다. 
//		결국에는 한번에 하나의 원판을 이동시켜야되니. 반복을 재귀로 구현할 수 있다.
	public static void hanoi(int cdCount,int A,int B, int C) {
		countHanoi++;
		if(cdCount==1) // 하나만 이동 여기서 이러는 이유는 재귀형태로 cdCount-1씩 해서 아래서 부터 맨위거만 이동하게 재귀형태로 구성될것이기 때문
		{ //여튼 하나만 이동할 수 있으면 이동
			b.append((A+" "+C)).append('\n');
		}
		else //아니라면 
		{	//재귀형터로 들어감!
		
			hanoi(cdCount-1, A, C, B);
			b.append((A+" "+C)).append('\n');
			hanoi(cdCount-1, B, A, C);
		}
	}
}
