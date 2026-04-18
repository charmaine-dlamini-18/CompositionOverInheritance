package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.JobFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeServiceTest {

    private IEmployeeService service = EmployeeService.getService();

    private Address x = AddressFactory.createAddress("20",
            "Adderley St",
            "Cape Town",
            "8100");

    private Job j = JobFactory.createJob("JB12345",
            "Developer",
            " Senior Backend developer",
            "Full time");
    private Employee employee = EmployeeFactory.createEmployee("12345",
            "Chantelle",
            "Hendricks",
            "chantelle@gmail.com",x,j);
    @Test
    void a_create() {
        Employee created = service.create(employee);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
       Employee read = service.read(employee.getEmployeeNumber());
       assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Employee newEmployee = new Employee.Builder()
                .copy(employee)
                .setLastName("Gibsons")
                .build();
        Employee updated = service.update(newEmployee);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void d_getAll() {
        System.out.println(service.getAll());
    }
}