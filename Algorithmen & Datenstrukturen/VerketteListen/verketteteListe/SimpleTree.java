/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Udo
 */
public class SimpleTree {
    Node first;
    
    public void add(int n) {
        if (first == null) 
            first = new Node(n);
        else {
            Node cn = first;
            while (cn.next != null)
                cn = cn.next;
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
}
