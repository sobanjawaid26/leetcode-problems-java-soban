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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null){
            int n1 = temp.val;
            int n2 = temp.next.val;
            int gcd = getGCD(n1, n2);
            ListNode temp2 = temp.next;
            temp.next = new ListNode(gcd);
            temp.next.next = temp2;
            temp  = temp.next.next;
        }
        return head;
    }
    public static int getGCD(int a, int b){
        int i;
        if (a < b)
            i = a;
        else
            i = b;
 
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
}