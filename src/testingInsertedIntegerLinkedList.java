public class testingInsertedIntegerLinkedList {
    
    public static void main(String[] args) {
        
        Integer one =1;
        Integer two = 2;
        Integer three = 3;
        Integer four =4;
        
        IntegerLinkeList list = new IntegerLinkeList ();
        
        list.insertSorted (three);
        list.printList ();
        list.insertSorted (two);
        list.printList ();
        list.insertSorted (one);
        list.printList ();
        list.insertSorted (four);
        list.printList ();
        
    }
}