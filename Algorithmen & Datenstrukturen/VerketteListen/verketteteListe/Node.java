/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Udo
 */
public class Node {
    private int key;
    public Node next;

    public Node(int n) {
        this.key = n;
    }

    public void print() {
        System.out.printf("Key: %d\n", key);
    }
}
