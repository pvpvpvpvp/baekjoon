package com.no;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class No1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseCount =sc.nextInt();

        int[][] caseDis = new int[caseCount][6]; 
        // 0,1 3,4 는 각 터렛의 위치 좌표
        // 2,5는 각 터렛에서의 거리
        for(int i=0;i<caseCount;i++)
        {
            for(int j=0;j<6;j++)
            {
                caseDis[i][j]=sc.nextInt();
            }
        }
        int[] result = new int[caseCount];
        for(int i=0;i<caseCount;i++)
        {
           result[i]=sqrtResult123(caseDis[i][0], caseDis[i][1], caseDis[i][2],
                                   caseDis[i][3],caseDis[i][4], caseDis[i][5]);
            System.out.println(result[i]);
        }
        
           
     
       
        sc.close();
    }
    public static int sqrtResult123(int x1,int y1,int r1,int x2,int y2,int r2) {
        int pow =  (int)Math.pow(x1-x2,2)+(int)Math.pow(y1-y2,2);
        int rpowminus = (int)Math.pow(r1-r2,2);
        int rpowpuls =(int)Math.pow(r1+r2, 2);
        if(x1==x2&y1==y2&r1==r2)  //같은 원점과 같은 거리일때 
          {
              return -1;
          }
          else if(pow==rpowminus||pow==rpowpuls){
            // 내접과 외접의 조건
            return 1;
          }else if(pow>rpowpuls||pow<rpowminus){
            //내부에 포함 되있을경우 외부에서 서로 닿지 않을경우
            return 0;
          }else{
            return 2;  
          }
       
    }
}
