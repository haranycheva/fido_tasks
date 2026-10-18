public class App {
    public static void main(String[] args) throws Exception {
        TwoThirdsOfLinkedList showTwoThirdNode = new TwoThirdsOfLinkedList();
        Node<Integer> OdnozviaznyyHead = createOnozvyaznyyList(0, 1, 2, 3, 4);
        Node<Integer> twoThirdNode = showTwoThirdNode.getTwoThirdsNode(OdnozviaznyyHead);
        System.out.println("Element at two-thirds position: " + (twoThirdNode != null ? twoThirdNode.data : "null"));
    }

    @SafeVarargs
    private static <T> Node<T> createOnozvyaznyyList(T... elements) {
        if (elements.length == 0)
            return null;

        Node<T> head = new Node<>(elements[0]);
        Node<T> currEl = head;

        for (int i = 1; i < elements.length; i++) {
            currEl.next = new Node<>(elements[i]);
            currEl = currEl.next;
        }

        return head;
    }
}
