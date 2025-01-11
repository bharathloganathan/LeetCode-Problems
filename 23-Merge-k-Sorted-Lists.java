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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list=new ArrayList<>();
        for(ListNode l:lists){
            while(l!=null){
                list.add(l.val);
                l=l.next;
            }
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int n:list){
            curr.next=new ListNode(n);
            curr=curr.next;
        }
        return dummy.next;
    }
}