
package za.ac.cput.factory;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Job;
import za.ac.cput.util.Helper;


public class EmployeeFactory {
    public static Employee createEmployee(String employeeNumber,
                                          String firstName,
                                          String lastName,
                                          String email,
                                          Address address,
                                          Job job) {

        if(Helper.isNullOrEmpty(employeeNumber)
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
        ){
            return null;
        }
        if (Helper.isNull(address)|| Helper.isNull(job)){
            return null;
        }
        if (!Helper.isValid(email)){
            return null;
        }
        return new Employee.Builder()
                .setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .setJob(job)
                .build();
    }
}
