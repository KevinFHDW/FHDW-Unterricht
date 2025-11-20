//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Stack<String> stack = new Stack<String>(3);
//    System.out.println(stack.size());
    StackLinkedList<Integer> stackLinkedList = new StackLinkedList<>();
    stackLinkedList.push(1);
    stackLinkedList.push(2);
    stackLinkedList.push(5);
    stackLinkedList.push(9);
    stackLinkedList.push(10);
    StackLinkedList<Integer> copy = stackLinkedList.copy();
    System.out.println("Wurde copied.");
//    System.out.println(stackLinkedList.size());
    int penis = stackLinkedList.size();
    for (int i = 0 ; i < penis ; i++){
//        System.out.println(stackLinkedList.pop());
        System.out.println(copy.pop());
    }
    }
