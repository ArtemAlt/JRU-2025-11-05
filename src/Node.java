public class Node<T> {
    Node<T> next;
    Node<T> prev;
    T value;


    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
