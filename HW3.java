/**
 * Необходимо реализовать метод разворота связного списка
 * (двухсвязного или односвязного на выбор).
 */
public class HW3 {

    public class LinkedList {
        private Node head;
        private Node tail;
     
        public class Node {
            private int value;
            private Node nextNode;
            private Node previousNode;
        }
        
        public void reverse(){
            Node node = head;
            while (node != null) {
                Node next = node.nextNode;
                Node previous = node.previousNode;
                node.nextNode = previous;
                node.previousNode = next;
                if (previous == null) {
                    tail = node;
                }
                if (next == null) {
                    head = node;
                }
                node = next;
            }
        }
    }
}