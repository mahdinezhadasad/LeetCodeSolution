import java.util.Iterator;
import java.util.LinkedList;

public class JdkLinkeList {
    
    public static void main(String[] args) {
    
    
        Employee janeJones = new Employee ("Jane", "Jones", 123);
        Employee johnDoe = new Employee ("John", "Doe", 4567);
        Employee marySmith = new Employee ("Mary", "Smith", 22);
        Employee mikeWilson = new Employee ("Mike", "Wilson", 3245);
        Employee billEnd = new Employee ("bill","End",123);
    
    
        LinkedList<Employee>  list = new LinkedList<> ();
        list.addFirst (janeJones);
        list.addFirst (johnDoe);
        list.addFirst (marySmith);
        list.addFirst (mikeWilson);
    
        Iterator<Employee> iter = list.iterator ();
        
        while (iter.hasNext ()){
    
            System.out.print (iter.next ());
    
            System.out.print ("<==>");
        }
        System.out.println ("null");
        
        list.addLast (billEnd);
        
        iter = list.iterator ();
        System.out.println ("HEAD -> ");
        
        while(iter.hasNext ()){
    
            System.out.print (iter.next ());
            System.out.print ("<=>");
        }
        System.out.println ("null");
    
    
    
        list.removeFirst ();
    
        iter = list.iterator ();
        System.out.println ("HEAD -> ");
    
        while(iter.hasNext ()){
        
            System.out.print (iter.next ());
            System.out.print ("<=>");
        }
        System.out.println ("null");
    
    
    }
}