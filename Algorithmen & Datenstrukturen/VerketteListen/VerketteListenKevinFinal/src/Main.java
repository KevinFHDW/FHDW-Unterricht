//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    SimpleTree st = new SimpleTree();
    for (int i=1; i <= 10; ++i)
        st.add(i);
    st.print();
    st.deleteLast();
    st.print();
}
