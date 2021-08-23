package com.no;

import java.util.Scanner;

// 문제 두 지점에서 측정한 거리와 측정 지점의 좌표로 
// 대상이 있을 수 있는 좌표의 개수 찾기
// 좌표가 아니고 좌표의 개수만 필요하기 때문에
// 원의 성질을 이용하여 찾아내야하고
// 실수형의 부정확성(부동소숫점으로 인한) 때문에
// sqrt 사용하지 않고 pow(??,2) 식으로 제곱식으로 계산.

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
