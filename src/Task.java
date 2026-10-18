class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}

class TwoThirdsOfLinkedList {
    public <T> Node<T> getTwoThirdsNode(Node<T> head) {

        if (head == null || head.next == null) {
            return null;
        }

        int n = 0;
        Node<T> currEl = head;
        while (currEl != null) {
            n++;
            currEl = currEl.next;
        }

        int IndexToFind = (2 * n) / 3 - 1;

        currEl = head;
        for (int i = 0; i < IndexToFind; i++) {
            currEl = currEl.next;
        }

        return currEl;
    }
}