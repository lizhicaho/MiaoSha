package com.company;
//反转链表
public class ReverseLinked {
    //输入: 1->2->3->4->5->NULL
    //输出: 5->4->3->2->1->NULL
    //1->NULL
    //2->1->NULL
    //3->2->1->NULL
    //4->3->2->1->NULL
    //5->4->3->2->1->NULL 此时指针指向了输入的Null  所以暂停
    public ListNode ReverseList(ListNode head) {
        if (head==null)
            return null;
         ListNode pre=null;
         ListNode next=null;
         ListNode curr=head;
         while(curr!=null){
             //保存下一个地址  防止断裂
             next=curr.next;
             //此时执行完新链表指向NULL
             curr.next=pre;
             //此时再把他给pre 此时的pre的next指向null
             pre=curr;
             //再把此时的的头指针后移
             curr=next;
             //一直循环到curr=null
         }
         return pre;
    }
    public static void main(String[] args){

    }
}
