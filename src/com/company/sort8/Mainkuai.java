package com.company.sort8;

import java.util.ArrayList;
import java.util.List;

public class Mainkuai {
    public static void kuaisu(int array[]) {
        sort(array, 0, array.length-1);
        List aa = new ArrayList();
        for (int i : array) {
            aa.add(i);
        }
        System.out.println("快速排序:");
        System.out.println(aa.toString());

    }
    public static void sort(int[] array,int low,int high){
        if(low>=high)
            return;
        int jizhun=sortarray(array,low,high);
        sort(array,low,jizhun-1);
        sort(array,jizhun+1,high);

    }
    public static int sortarray(int array[],int low,int high){
        int jizhun=array[low];
        while (low<high){
            while(low<high && array[high]>=jizhun) high--;
            array[low]=array[high];
            while(low<high && array[low]<=jizhun)low++;
            array[high]=array[low];
        }
        array[high]=jizhun;
        return low;
    }
    public static void main(String[] args){
        int array[] = { 8, 5, 36, 58, 24, 62, 12, 9, 35, 87, 96, 58, 25,88,98 };
        kuaisu(array);

    }
}
