import java.util.ArrayList;
import java.util.List;

public class Employelist {
    
    public static void main(String[] args) {
        
//        List<Employee> employeeList = new ArrayList<> ();
//        employeeList.add (new Employee ("mahmud","allu",5));
//        employeeList.add (new Employee ("hallowien","eyenigelmis",6));
//        employeeList.add (new Employee ("elle","cokdegil",7));
//
        Employee janeJones  = new Employee ("Jane","Jones",123);
        Employee johnDoe = new Employee ("John","Doe",457);
        Employee marySmith = new Employee ("Mary","Smith",22);
        Employee mikeWilson = new Employee ("Mike","'Wilson",3425);
        
        EmployeeLinkedList list = new EmployeeLinkedList ();
        list.addToFront (janeJones);
        list.addToFront (johnDoe);
        list.addToFront (marySmith);
        list.addToFront (mikeWilson);
        
        list.printList ();
        
    }
}