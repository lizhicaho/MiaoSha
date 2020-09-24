package com.company;

// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;

public class Main {
    public  static int Value1(int N,int W,int K,int[] costs,int[] profits){
        int temp,temp2,value3=W;
        for(int j=0;j<profits.length-1;j++){
            for(int o=0;o<profits.length-1-j;o++){
                if(profits[o]<profits[o+1]){
                    temp=profits[o];
                    profits[o]=profits[o+1];
                    profits[o+1]=temp;

                    temp2=costs[o];
                    costs[o]=costs[o+1];
                    costs[o+1]=temp2;
                }

            }
        }
        for (int i=0 ;i<K;i++){
        for (int j=0;j<profits.length;j++){
            if(costs[j]<=value3){
                value3+=profits[j];
                break;
            }
        }

        }
    return value3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=0,W=0,K=0;

        N= sc.nextInt();
        W= sc.nextInt();
        K= sc.nextInt();
        int costs[]=new int[N];
        int profits[]=new int[N];
        for (int i=0;i<costs.length;i++){
            costs[i]=sc.nextInt();
        }
        for (int j=0;j<profits.length;j++){
            profits[j]=sc.nextInt();
        }
        int value2=Value1(N,W,K,costs,profits);
        System.out.println(value2);
        }


}