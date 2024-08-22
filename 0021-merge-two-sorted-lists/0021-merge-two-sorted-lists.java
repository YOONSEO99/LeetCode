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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. 하나의 list가 null 이면, 다른 list 반환
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode newList = new ListNode(0);
        ListNode tmp = newList;
        
        // 2. 두 개의 linkedlist 모두 null이 아닐 경우 반복해서 비교
        while(list1!=null && list2!=null){
            if(list1.val > list2.val){
                tmp.next = list2;
                list2 = list2.next;
            }else{
                tmp.next = list1;
                list1 = list1.next;
            }
            tmp = tmp.next;
        }
        
        // 3. list의 길이가 서로 다를 때, null인 경우 
        if(list1 ==null){
            tmp.next = list2;
        }else{
            tmp.next = list1;
        }
        
        return newList.next;
    }
}