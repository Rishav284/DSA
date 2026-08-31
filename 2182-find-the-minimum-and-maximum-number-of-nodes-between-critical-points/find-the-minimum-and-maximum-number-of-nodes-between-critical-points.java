/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> possInd=new ArrayList<>();
        int prevVal=head.val;
        ListNode temp=head.next;
        int ind=1;
        while(temp!=null && temp.next!=null){
            int currVal=temp.val;
            int nextVal=temp.next.val;
            if((currVal>prevVal && currVal>nextVal) || (currVal<prevVal && currVal<nextVal)){
                possInd.add(ind);
            }
            ind++;
            prevVal=currVal;
            temp=temp.next;
        }
        if(possInd.size()<2){
            return new int[]{-1,-1};
        }
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<possInd.size()-1;i++){
            minDist=Math.min(minDist,possInd.get(i+1)-possInd.get(i));
        }
        int maxDist=possInd.get(possInd.size()-1)-possInd.get(0);
        return new int[]{minDist,maxDist};
    }
}