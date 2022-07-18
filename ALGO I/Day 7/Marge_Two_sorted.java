public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode head=null;
        ListNode cur=null;
        while(p1!=null&&p2!=null){
            if(head==null){
                if(p1.val<=p2.val){
                    head=cur=p1;
                    p1=p1.next;
                }else{
                    head=cur=p2;
                    p2=p2.next;
                }
            }else{
                if(p1.val<=p2.val){
                    cur.next=p1;
                    cur=p1;
                    p1=p1.next;
                }else{
                    cur.next=p2;
                    cur=p2;
                    p2=p2.next;
                }
            }
        }
        if(p1!=null) cur.next=p1;
        if(p2!=null) cur.next=p2;
        return head;
    }
}