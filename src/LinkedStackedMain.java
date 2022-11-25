public class LinkedStackedMain {
    

    
        public static void main(String[] args) {
            Employee janeJones = new Employee ("Jane", "Jones", 123);
            Employee johnDoe = new Employee ("John", "Doe", 4567);
            Employee marySmith = new Employee ("Mary", "Smith", 22);
            Employee mikeWilson = new Employee ("Mike", "Wilson", 3245);
            Employee billEnd = new Employee ("bill","End",123);
        
//            LinkedStack  stacked = new LinkedStack ();
//
//            stacked.push (janeJones);
//            stacked.push(johnDoe);
//            stacked.push (marySmith);
//            stacked.push(mikeWilson);
//            stacked.push (billEnd);
//
//            System.out.println (stacked.peek ());
        
            
            ArrayQueue queue = new ArrayQueue (10);
            queue.add (janeJones);
            queue.add (johnDoe);
            queue.add (marySmith);
            queue.add (mikeWilson);
            queue.add (billEnd);
            
            queue.printQueue ();
            
            queue.remove ();
            System.out.println ("----------------------------");
            queue.printQueue ();
            
        }
    
}