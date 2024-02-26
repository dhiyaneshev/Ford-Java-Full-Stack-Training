package collections1;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Implement operations here
        ListNode list1 = createList(scanner);
        ListNode list2 = createList(scanner);

        ListNode mergedList = mergeSortedLists(list1, list2);

        displayList(mergedList);

        scanner.close();
    }

    private static ListNode createList(Scanner scanner) {
        int n = scanner.nextInt();
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < n; i++) {
            curr.next = new ListNode(scanner.nextInt());
            curr = curr.next;
        }

        return dummy.next;
    }

    private static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }

    private static void displayList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
    }

}
