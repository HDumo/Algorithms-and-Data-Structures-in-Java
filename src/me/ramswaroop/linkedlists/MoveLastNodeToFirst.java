package me.ramswaroop.linkedlists;

import me.ramswaroop.common.SingleLinkedList;
import me.ramswaroop.common.SingleLinkedNode;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 6/23/15
 * @time: 7:52 PM
 */
public class MoveLastNodeToFirst {

    public static <E extends Comparable<E>> void moveLastNodeToFirst(SingleLinkedList<E> list) {
        if (list.size <= 1) return;

        SingleLinkedNode<E> curr = list.getNode(0), prev = curr;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr.next = list.head;
        list.head = curr;
    }

    public static void main(String a[]) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.add(00);
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.printList();
        moveLastNodeToFirst(linkedList);
        linkedList.printList();
    }
}
