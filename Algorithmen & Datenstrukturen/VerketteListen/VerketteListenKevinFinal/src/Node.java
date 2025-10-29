public class Node {
    int key;
    public Node next;

    public Node(int key) {
        this.key = key;
    }

    public void print() {
        System.out.printf("Key: %d\n", key);
    }
}
