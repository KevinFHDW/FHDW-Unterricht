/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Udo
 */
import java.util.Arrays;

public class Programm {
    final static int MAXM = 100000;
    
    public static void main( String[] args) {
        Integer [] a = new Integer[MAXM];
        long start, elapsed;

        System.out.println("Start der Sortieralgorithmen mit " + a.length + " Elementen");

        init(a);
        start = System.currentTimeMillis();
        BubbleSort(a);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("BubbleSort - Zeit in Millisekunden: " + elapsed);
  
        init(a);
        start = System.currentTimeMillis();
        InsertionSort(a);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("InsertionSort - Zeit in Millisekunden: " + elapsed);
      
        init(a);
        start = System.currentTimeMillis();
        SelectionSort(a);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("SelectionSort - Zeit in Millisekunden: " + elapsed);
        
        init(a);
        start = System.currentTimeMillis();
        QuickSort(a, 0, a.length-1);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("QuickSort - Zeit in Millisekunden: " + elapsed);
        
        init(a);
        start = System.currentTimeMillis();
        ShellSort(a);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("ShellSort - Zeit in Millisekunden: " + elapsed);
        
        init(a);
        start = System.currentTimeMillis();
        Arrays.sort(a);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("Arrays.sort - Zeit in Millisekunden: " + elapsed);
 
        Produkt [] p = new Produkt[MAXM];
        int i;
        for (i=0; i < MAXM; ++i) 
            p[i] = new Produkt("a"+i, MAXM -i);
        start = System.currentTimeMillis();
        ShellSort(p);
        elapsed = System.currentTimeMillis() - start;
        System.out.println("ShellSort Klassen - Zeit in Millisekunden: " + elapsed);
 
    } 
    
    private static void init(Integer [] a) {
        for (int i = 0; i < a.length; ++i) {
        //    a[i] = (int)(Math.random()*1000000);
            a[i] =  a.length - i;
        }
    }
    
    public static void BubbleSort(Comparable [ ] a) 
    {
        int i, j;
        boolean swapped;
        for (i = 1; i < a.length; i++){
            swapped = false;
            for(j = 0; j < a.length - i; j++){
                if(!less(a[j],a[j+1])) {
                    exch(a, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
    
    public static void QuickSort(Comparable [] a, int low, int high) {
        int i = low, j = high;
        Comparable z = a[(low + high) / 2]; //immer die Mitte
    
        while(i <= j) {
            while(less(a[i], z) ) i++;      // Index i wandert nach rechts
            while( less(z, a[j]) ) j--;     // Index j wandert nach links
            if(i <= j) {
                exch(a, i, j);              // Vertauschen
                i++; 
                j--;
            }
        }
    // Rekursive Aufrufe
        if(low < j)     QuickSort(a, low, j);
        if(i < high)    QuickSort(a, i, high); 
        return;
    }
    
    public static void SelectionSort(Comparable [ ] a) 
    {
        int N = a.length;
        for (int i = 0; i < N; ++i) {
            int min = i;
            for (int j=i+1; j < N; ++j)
                if (less(a[j], a[min]))  
                    min = j;
            if (i != min)
                exch(a, i, min);
        }
    }
    
    public static void InsertionSort(Comparable [ ] a) 
    {
        int N = a.length;
        for (int i = 0; i < N; ++i)
        {
            for   (int j = i; j > 0 && less(a[j], a[j-1]); --j)
                exch(a,j, j-1);
        }
    }
    
    public static void ShellSort(Comparable [ ] a) 
    {
        int N = a.length;
        int i, j, k, h;
        Comparable t;
 /*       
        int [] spalten = {2147483647, 1131376761, 410151271, 157840433,            
            58548857, 21521774, 8810089, 3501671, 1355339, 543749, 213331,
            84801, 27901, 11969, 4711, 1968, 815, 271, 111, 41, 13, 4, 1};
 */
        
        int [] spalten = {21523360, 7174453, 2391484, 797161, 265720, 88573, 29524, 9841, 3280, 1093, 364, 121, 40, 13, 4, 1};
                
        for (k = 0; k < spalten.length; k++) {
            h = spalten[k];
        // Sortiere die "Spalten" mit Insertionsort
            for (i = h; i < N; i++)  {
                t = a[i];
                j = i;
                while (j >= h && less(t, a[j-h])) {
                    exch(a, j, j-h);
                    j = j - h;
                }
                a[j] = t;
            }
        }
        return;
    }
   
    private static boolean less(Comparable v, Comparable w)
   { return v.compareTo(w) < 0;  } // liefert true, falls v < w   
  
    private static void exch(Comparable[ ] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t; } 
    
    public static void show(Comparable[ ] a)
    {
        for (int i = 0; i < Math.min(30, a.length); ++i)
            System.out.printf(a[i] + " ");
        System.out.printf("\n");
    }
    
    public static boolean isSorted(Comparable[ ] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (less(a[i], a[i-1]) )
                return false;
        return true;
    }
}


