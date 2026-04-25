package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
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
class EmployeeRepositoryTest {
    private static IEmployeeRepository repository = EmployeeRepository.getRepository();

    private Address x = AddressFactory.createAddress("14",
            "Station road",
            "Cape Town",
            "7462");

    private Job j = JobFactory.createJob("JB2345",
            "Developer",
            " Senior Backend developer",
            "Full time");

    private Employee employee = EmployeeFactory.createEmployee("12345",
            "Charmaine",
            "Dlamini",
            "charmainedlamini@gmail.com",x,j);

    @Test
    void a_create() {
        Employee created = repository.create(employee);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
        Employee read = repository.read(employee.getEmployeeNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Employee newEmployee = new Employee.Builder()
                .copy(employee)
                .setLastName("Chadson")
                .build();
        Employee updated = repository.update(newEmployee);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(employee.getEmployeeNumber()));
        System.out.println("Success: employee deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
