package com.company.sort8;

public class Main {
    public static void main(String[] args){
        int array[] = { 8, 22,5, 36, 58, 24, 62, 12, 9, 35, 87, 96, 58, 25,88,98 };
        //插入
       /* for (int i=1;i< array.length;i++){
            int val=array[i];
            int index=i;
            while(index>0 && array[index-1]>val){
                array[index]=array[index-1];
                index--;
            }
            array[index]=val;
        }*/
        int temp;
        for(int delat= array.length/2;delat>=1;delat/=2){
            for (int i=delat;i<array.length;i++){
                for (int j=i;j>=delat && array[j]<array[j-delat];j-=delat){
                    temp=array[j];
                    array[j]=array[j-delat];
                    array[j-delat]=temp;

                }

            }
        }
    }
}
