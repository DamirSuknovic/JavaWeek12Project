package constructors;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class Microsoft {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(); // calling for default constructor

        employeeOne.salary = 120000;
        System.out.println(employeeOne);

        employeeOne.name = "Ersin";
        employeeOne.ID = 100;
        employeeOne.jobTitle = "Technical Manager";

        Employee employeeTwo = new Employee("Efe", "QA lead", 200, 110000  );

        ArrayList<Employee> team = new ArrayList<>();
        team.add(employeeOne);
        team.add(employeeTwo);

        team.add(new Employee("Jamal", "SDET", 300, 95000));

        // let's find Max salary from team list

        double maxSalary = Double.MIN_VALUE;
        for (Employee each : team ){ // each is an Employee object
            if (each.salary>maxSalary){
                maxSalary = each.salary;
            }
        }

        System.out.println("maxSalary = " + maxSalary);

        // I want to find Jamal's job title
        for (Employee each : team ){
            if (each.name.equalsIgnoreCase("jamal")){
                System.out.println(each.jobTitle);
            }
        }
        /*
        Note: You can change or call static fields through object or ClassName, but second one is preferable
         */

       // employeeOne.companyName = "Tesla";
        Employee.companyName = "Tesla";

        // company name for each employee
        for (Employee each : team ){
            System.out.println(each.name+" is working for "+each.companyName);
        }

    }


}
