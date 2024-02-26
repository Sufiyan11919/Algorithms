/**
 * Definition for singly-linked ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode midNext = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        return merge(left, right);
    }

    public ListNode merge(ListNode l, ListNode r) {
        ListNode extraNodeHead = new ListNode(-1);
        ListNode curr = extraNodeHead;
        while(l != null && r != null) {
            if (l.val <= r.val) {
                curr.next = l;
                l = l.next;
            } else {
                curr.next = r;
                r = r.next;
            }
            curr = curr.next;
        }
        if (l != null) {
            curr.next = l;
        } else {
            curr.next = r;
        }

        return extraNodeHead.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

//class Solution {
//    public ListNode sortList(ListNode head) {
//        if(head == null || head.next == null) {
//            return head;
//        }
//        boolean sorted = false;
//        ListNode extraHeadNode = new ListNode(0);
//        extraHeadNode.next = head;
//
//        while(!sorted){
//            sorted = true;
//            ListNode prev = extraHeadNode;
//            ListNode current = extraHeadNode.next;
//            ListNode next = current.next;
//            while(next != null){
//                if (current.val > next.val){
//                    current.next = next.next;
//                    next.next = current;
//                    prev.next = next;
//                    prev = next;
//                    next = current.next;
//                    sorted = false;
//                }else{
//                    prev = current;
//                    current = next;
//                    next = next.next;
//                }
//            }
//        }
//        return extraHeadNode.next;
//    }
//}
