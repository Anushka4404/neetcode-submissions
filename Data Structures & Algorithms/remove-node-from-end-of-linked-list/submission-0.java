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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        List<ListNode>nodes = new ArrayList<>();
        while (temp!=null) {
            nodes.add(temp);
            temp = temp.next;
        }
        int removeIndex = nodes.size() - n;
        if (removeIndex == 0) {
            return head.next;
        }
        nodes.get(removeIndex - 1).next = nodes.get(removeIndex).next;
        return head;
    }
}
