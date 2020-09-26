package com.company.sort8;

import java.util.ArrayList;
import java.util.List;

public class TestNode {
    public static boolean getHashTree(TreeNode root,int sum){
        if (root == null) return false;
        else{
            List<Integer> sumber=new ArrayList();
            getsum(root,0,sumber);
            for(int i = 0; i < sumber.size(); i++){
                if(sumber.get(i) == sum)
                    System.out.println("有的");
                    return true;
            }

        }

        return false;
    }
    public static  void getsum(TreeNode root,int sum,List sumber){
        if (root.left==null && root.right==null)
        {
            sumber.add((int)root.value+sum);
            return;
        }else if(root.left != null)
        {
            getsum(root.left,sum+(int)root.value,sumber);
        }else if(root.right != null)
        {
            getsum(root.right,sum+(int)root.value,sumber);
        }

    }
    public static boolean gethasezhi(TreeNode root,int sum){
        if (root.left==null && root.right==null & sum-(int)root.value==0){
            System.out.println("有的呢");
            return true;
        }else{
            if(root.left!=null && root.right==null)
              return gethasezhi(root.left,sum-(int)root.value);
            else if(root.left==null && root.right!=null)
                return gethasezhi(root.right,sum-(int)root.value) ;
            else return gethasezhi(root.right,sum-(int)root.value) || gethasezhi(root.left,sum-(int)root.value);
        }
    }
    public static void main(String[] args) {

        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        TreeNode roots = new TreeNode();
        for (int number : randoms) {
            roots.add(number);
        }
        //System.out.println(roots.values());
        gethasezhi(roots,299);
    }
}
