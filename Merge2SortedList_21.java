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

class MergeList {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode current_list1 = list1;
		ListNode current_list2 = list2;
		ListNode l3 = new ListNode(0);
		ListNode tail = l3;

		while (current_list1 != null || current_list2 != null) {
			
			if(current_list1 ==null && current_list2 !=null) {
				tail.next = new ListNode(current_list2.val);
				current_list2 = current_list2.next;
				tail = tail.next;
			}
			else if(current_list2 ==null && current_list1 !=null) {
				tail.next = new ListNode(current_list1.val);
				current_list1 = current_list1.next;
				tail = tail.next;
			}
			else if (current_list1.val == current_list2.val) {
				tail.next = new ListNode(current_list1.val);
				tail = tail.next;
				tail.next = new ListNode(current_list2.val);
				tail = tail.next;
				current_list1 = current_list1.next;
				current_list2 = current_list2.next;
			} else if (current_list1.val > current_list2.val) {
				tail.next = new ListNode(current_list2.val);
				tail = tail.next;
				current_list2 = current_list2.next;
			} else {
				tail.next = new ListNode(current_list1.val);
				tail = tail.next;
				current_list1 = current_list1.next;
			}
		}
		return l3.next;
	}
}

public class Merge2SortedList_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ListNode l1 = new ListNode(0); // created pointers
		ListNode l1_pointer = l1;
		ListNode l2 = new ListNode(0);
		ListNode l2_pointer = l2;

		System.out.println("Enter First List Size"); // List Size
		int n = sc.nextInt();
		System.out.print("Enter Second List Size");
		int l2_size = sc.nextInt();

		int i = 0, j = 0;
		while (n != i || l2_size != j) {

			if (i != n) {
				i++;
				System.out.println("Enter " + i + "th Elemnt");
				l1_pointer.next = new ListNode(sc.nextInt()); // put the value in it
				l1_pointer = l1_pointer.next; // Moved to next point

			} else {
				j++;				
				System.out.println("Enter " + j + "th Element");
				l2_pointer.next = new ListNode(sc.nextInt());
				l2_pointer = l2_pointer.next;// Moved to next point
			}
		}
		MergeList ml = new MergeList();
		ListNode l3 = ml.mergeTwoLists(l1.next, l2.next); // because of forget that 0 we insert in start
		while(l3 !=null) {
			System.out.print(l3.val +" ");
			l3 = l3.next;
		}
	}

}
