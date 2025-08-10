package leetcode;

//Definition for singly-linked list.

class Solution2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		// HashSet<Integer> set = new HashSet<Integer>();

		ListNode currhead = head;

		if (currhead == null)
			return head;
		while (currhead.next != null) {
			if (currhead.val == currhead.next.val) {
				if (currhead.next.next == null)
					currhead.next = currhead.next.next;
				else
					currhead.next = currhead.next.next;
			} else
				currhead = currhead.next;
		}
		return head;
	}
}

public class RemoveDuplicateformList_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s = new Solution2();

		Solution2.ListNode head = s.new ListNode(1);
		head.next = s.new ListNode(1);
		head.next.next = s.new ListNode(2);

		Solution2.ListNode res = s.deleteDuplicates(head);
		while (res != null) {
			if (res.next == null)
				System.err.print(res.val);
			else
				System.out.print(res.val + " ---> ");
			res = res.next;
		}

	}

}
