/**
 *
 * @author Udo
 * Stand: September 2025
 */
// Implementierung 4 Traversierungsarten
// Implementierung BST

// imports für Implementierung für levelOrderTraversal mit Queus
//import java.util.LinkedList;
//import java.util.Queue;
import java.util.*;

public class BinaryTree {
    private class Node {
        int key;
        Node left, right;
        public Node(int k) { key = k; }
    }
   
    Node root;
 
// Methode zum Hinzufügen eines Wertes zum Baum
    public void add(int key) { root = add(key, root); }
    
    private Node add(int key, Node current) {
        if (current == null) {return new Node(key); }
        else  if (key < current.key) {
            current.left = add(key, current.left);
        } else if (key > current.key) {
            current.right = add(key, current.right);
        } else {
throw new IllegalArgumentException("Tree contains a node with key " + key);
        }
        return current;
    }
     
//inOrder: Links -> Vater -> Rechts
    public void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);        // Linker Teilbaum
        System.out.print( node.key + " ");  // Vaterknoten
        inOrderTraversal(node.right);       // Rechter Teilbaum
    }
    
// Preorder: Vater -> Links -> Rechts
    public void preOrderTraversal(Node node) {
        if (node == null) return; 
        System.out.print(node.key + " ");   // Vaterknoten
        preOrderTraversal(node.left);       // Linker Teilbaum
        preOrderTraversal(node.right);      // Rechter Teilbaum
    }
    
 // Postorder: Links -> Rechts -> Vater
    public void postOrderTraversal(Node node) {
        if (node == null)  return; 
        postOrderTraversal(node.left);      // Linker Teilbaum
        postOrderTraversal(node.right);     // Rechter Teilbaum
        System.out.print(node.key + " "); // Vaterknoten
    }
 
    public void levelOrderTraversal(Node root) {
        if (root == null)  return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            Node cn = queue.poll();
            System.out.print(cn.key + " "); // aktueller Knoten
 // Füge den linken Knoten zur Queue hinzu
            if (cn.left != null) {
                queue.add(cn.left);
            }
// Füge den rechten Knoten zur Queue hinzu
            if (cn.right != null) {
                queue.add(cn.right);
            }
        }
    }
    
    public void levelOrderTraversal1(Node root) {
        int height = getHeight(root);
        for (int i = 0; i <= height; ++i) { 
            print_level(root, i);
        }
    }
    
    private void print_level(Node n, int level_no) {
        if (n == null)
            return;
        if (level_no == 0)
            System.out.printf("%d ", n.key);
        else {
            print_level(n.left,  level_no - 1);
            print_level(n.right, level_no - 1);
        }
    }
    
    private int getHeight(Node n) {
        if (n == null)
            return -1;
        else {
            int left_height = getHeight(n.left);
            int right_height = getHeight(n.right);
            if (left_height >= right_height)
                return left_height + 1; //es fängt unten an mit 0 (-1 (weil kind ist null am ende) + 1)
            else
                return right_height + 1;
        }
    }
    public Node getMax() {
        if (root == null)
            return null;
        Node cn = root;
        while(cn.right != null)
            cn = cn.right;
        return cn;
    }
}