package leetCodes;
import java.util.Scanner;
class ListNode {
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

class Solution1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l1_Current = l1;
		ListNode l2_Current = l2;
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		int div = 0;
		while (l1_Current != null || l2_Current != null) {

			int l1_val = (l1_Current != null) ? l1_Current.val : 0;
			int l2_val = (l2_Current != null) ? l2_Current.val : 0;
			if (l2_Current != null)
				l2_Current = l2_Current.next;
			if (l1_Current != null)
				l1_Current = l1_Current.next;
//			System.out.println("L1 Val  " + l1_val + " L2 Val  " + l2_val);

			int sum = l2_val + l1_val + div;
			if (sum > 9) {
				div = sum / 10;
				int rem = sum % 10;
				tail.next = new ListNode(rem);
				tail = tail.next;

			} else {
				div = 0;
				tail.next = new ListNode(sum);
				tail = tail.next;
			}
		}
		if (div != 0) {
			tail.next = new ListNode(div);
			tail = tail.next;
		}
		return dummy.next;

	}
}

public class AddTwoNumbers_Q2 {

	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);

		Solution1 s = new Solution1();

		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(8);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next= new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
				

		ListNode l = s.addTwoNumbers(l1, l2);
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
	}
}