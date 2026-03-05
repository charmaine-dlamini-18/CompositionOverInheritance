package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void createEmployee() {
        //build employee and test if its correct
        Address x = AddressFactory.createAddress("14",
                "Station road",
                "Cape Town",
                "7462");
        Job j = JobFactory.createJob("JB2345",
                "Developer",
                " Senior Backend developer",
                "Full time");
        Employee employee = EmployeeFactory.createEmployee("12345",
                "Charmaine",
                "Dlamini",
                "charmainedlamini@gmail.com",x,j);

        assertNotNull(employee);
        System.out.println(employee);

    }
}