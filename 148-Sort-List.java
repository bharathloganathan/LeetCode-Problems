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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        for(int n:list){
            curr.next=new ListNode(n);
            curr=curr.next;
        }
        return dummy.next;
    }
}