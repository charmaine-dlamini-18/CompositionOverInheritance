
package za.ac.cput;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.JobFactory;


public class Main {
    public static void main(String[] args) {
        Address x = AddressFactory.createAddress("14",
                "Station road",
                "Cape Town",
                "7462");
        Job j = JobFactory.createJob("JB2345",
                "Developer",
                " Senior Backend developer",
                "Full time");
        Employee emp = EmployeeFactory.createEmployee("12345",
                "Charmaine",
                "Dlamini",
                "charmainedlamini@gmail.com",x,j);

        System.out.println(emp.toString());
    }
}
