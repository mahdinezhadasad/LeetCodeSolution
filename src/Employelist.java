import java.util.ArrayList;
import java.util.List;

public class Employelist {
    
    public static void main(String[] args) {
        
        List<Employee> employeeList = new ArrayList<> ();
        employeeList.add (new Employee ("mahmud","allu",5));
        employeeList.add (new Employee ("hallowien","eyenigelmis",6));
        employeeList.add (new Employee ("elle","cokdegil",7));
        
        employeeList.forEach (employee -> System.out.println (employee));
    }
}