/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Udo
 */

public class Produkt implements Comparable<Produkt>{
    String bezeichnung;
    double einzelpreis;
    
    public Produkt() {}; 
    
    public Produkt(String b, double e) { 
        bezeichnung = b;
        einzelpreis =  e;
    }   
    
    public void print() {
         System.out.printf("%-20s\t%7.2f\n", bezeichnung, einzelpreis ); 
    }
    
    public int compareTo(Produkt p1) {
        double x = this.einzelpreis - p1.einzelpreis;
        if (x < 0)
            return -1;
        if (x> 0)
                return 1;
        return 0;
    }
     
}
