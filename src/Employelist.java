import java.util.ArrayList;
import java.util.List;

public class Employelist {
    
    public static void main(String[] args) {

//        List<Employee> employeeList = new ArrayList<> ();
//        employeeList.add (new Employee ("mahmud","allu",5));
//        employeeList.add (new Employee ("hallowien","eyenigelmis",6));
//        employeeList.add (new Employee ("elle","cokdegil",7));
        Employee janeJones = new Employee ("Jane", "Jones", 123);
        Employee johnDoe = new Employee ("John", "Doe", 4567);
        Employee marySmith = new Employee ("Mary", "Smith", 22);
        Employee mikeWilson = new Employee ("Mike", "Wilson", 3245);
        EmployeeLinkedList list = new EmployeeLinkedList ();
        System.out.println (list.isEmpty ());
        list.addToFront (janeJones);
        list.addToFront (johnDoe);
        list.addToFront (marySmith);
        list.addToFront (mikeWilson);
        System.out.println (list.getSize ());
        list.printList ();
        list.removeFromFront ();
        System.out.println (list.getSize ());
        list.printList ();
        Employee billEnd = new Employee ("mahmud", "tuncel", 15);
        list.addToEnd (billEnd);
        list.printList ();
        System.out.println (list.getSize ());
        
    }
}