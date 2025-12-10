/*public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int n1 = 0;
        int n2 = 0;

        while(temp1 != null){
            n1++;
            temp1 = temp1.next;
        }
        while(temp2 !=null){
            n2++;
            temp2 = temp2.next;
        }
        if(n1 < n2){
            return findIntersection(headA, headB, n2-n1);
        }else{
            return findIntersection(headB, headA, n1-n2);
        }
    }

        private ListNode findIntersection(ListNode shorter, ListNode longer, int diff){
            while(diff --> 0){
                longer = longer.next;
            }
            while(shorter != null && longer != null){
                if(shorter == longer) return shorter;
                shorter = shorter.next;
                longer = longer.next;  
            }
            return null;
        }
        
}*/

 optimal approach 
    public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 == null)? headB : temp1.next;
            temp2 = (temp2 == null)? headA : temp2.next;
        }
        return temp1;
        
    }
}
