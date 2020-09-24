package com.company;
//今日练习字符串去重

import java.util.HashSet;
import java.util.TreeSet;

public class ByeString {
    public static void main(String[] args){
    String str="qwwbnmxcndsfnmxcn";
    find(str);
    }
    //方法一
    public static void find(String str){
        String[] strew=str.split("");
        HashSet<String> treeSet=new HashSet<>();
        for (String a:strew
             ) {
            treeSet.add(a);
        }
        for (String b:
             treeSet) {
            System.out.print(b);
        }

    }
    //方法二
}
