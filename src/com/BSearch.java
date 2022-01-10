package com;

public class BSearch {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 이진 탐색의 선행조건에 따라 ar은 정렬되어 있다고 가정한다.
		int[] ar= {1,4,6,9,10,11,14,16,18,20};
		int a=BSearch1(ar, 0, ar.length-1,-1);
		count=0;
		a=BSearch1(ar, 0, ar.length-1,0);
		count=0;
		a=BSearch1(ar, 0, ar.length-1,1);
	}
//	목표 이진탐색 알고리즘을 재귀형태로 구현하라.!
//	메소드의 형식 BSearch1(int arr[],int first,int last,int tager)
//	종료 조건은 first>last 일때 이다.
	
	public static int BSearch1(int arr[],int first,int last,int tager) {
		if(first>last)
		{
			System.out.printf("값 없음! %d회 진행\n",count);
			return -1;
		}
		int mid = (first+last)/2;
		count++;
		if(tager==arr[mid]) {
			System.out.printf("%d의 인덱스에서 %d 값을 찾았으며 %d회 진행하였습니다.",mid,tager,count);
			return count;
		}
		else if(tager>arr[mid])
		{
			BSearch1(arr, mid+1, last, tager);
		}else if(tager<arr[mid])
		{
			BSearch1(arr, first, mid-1, tager);
		}else
		{
			
			return -1;
			
		}
		return count;
		
		// TODO Auto-generated constructor stub
	}
 
}
