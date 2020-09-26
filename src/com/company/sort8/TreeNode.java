package com.company.sort8;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public TreeNode right;
    public TreeNode left;
    public Object value ;

    public void add(Object val) {
        if(value == null) this.value= val;
        else {
            if((Integer)value-(Integer) val>=0){
                if(left==null)
                {
                    left =new TreeNode();
                }
                   left.add(val);


            }else{
                if(right==null){
                    right =new TreeNode();
                }
                right.add(val);
            }
        }
    }
    public List<Object> values() {
        List values=new ArrayList();
        if(left != null){
            values.addAll(left.values());
        }
        values.add(value);
        if(right != null){
            values.addAll(right.values());
        }
        return values;
    }

}
