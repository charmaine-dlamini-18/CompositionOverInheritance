package za.ac.cput.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;
import za.ac.cput.repository.IEmployeeRepository;
import java.util.List;

public class EmployeeService implements IEmployeeService {

    private static IEmployeeService service;
    private IEmployeeRepository repository;

    private EmployeeService(){
      repository = EmployeeRepository.getRepository();
    }


    public static IEmployeeService getService(){
        if (service == null){
            service = new EmployeeService();
        }
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee read(String employeeNumber) {
        return this.repository.read(employeeNumber);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public List<Employee> getAll() {
        return this.repository.getAll();
    }
}
