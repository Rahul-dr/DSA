/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> m=new HashMap<>();
        ListNode curr=head;

        if(head==null) return false;

        if(head.next==null) return false;
        int i=0;
        while(curr.next!=null){
            if(m.containsKey(curr)) return true;
            m.put(curr, i);
            i++;
            curr=curr.next;
        }

        return false;
    }
}