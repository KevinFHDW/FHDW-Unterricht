/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Udo
 */
public class VerketteteListe {

    public static void main(String[] args) {
        SimpleTree st = new SimpleTree();
        for (int i=1; i <= 10; ++i)
            st.add(i);
        st.print();
/*
        System.out.println(st.delete(10));
        st.print();
*/
    }
}
