public class SimpleTree {
    Node first;

    public void add(int n) {
        if (first == null) //Falls es noch keinen Anfang gibt erstelle diesen
            first = new Node(n);
        else {
            Node cn = first; //current Node
            while (cn.next != null) //Solange CurrentNode.next existiert gehe überschreib current Node
                cn = cn.next; //Solange bis man das Ende gefunden hat.
            cn.next = new Node(n);
        }
    }

    public void print() {
        Node cn = first;
        while(cn != null) {
            cn.print();
            cn = cn.next;
        }
        System.out.printf("\n");
    }
    public void deleteLast(){
        Node cn = first;
        Node nextNode = cn.next;
        while (nextNode.next != null){
            cn = nextNode;
            nextNode = cn.next;
        }
        cn.next = null;
    }


}