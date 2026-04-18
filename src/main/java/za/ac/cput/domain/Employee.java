package za.ac.cput.domain;

public class Employee {
    //Attributes
    private String employeeNumber;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private Job job;

    private Employee(){

    }

    private Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.job = builder.job;
    }

    public String getEmployeeNumber() {

        return employeeNumber;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }
    public String getEmail() {

        return email;
    }

    public Address getAddress() {

        return address;
    }

    public Job getJob() {

        return job;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "\nEmployee Number: " + employeeNumber +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nEmail: " + email +
                "\nAddress: " + address +
                "\nJob: " + job;
    }

    //Builder class
    public static class Builder{
        private String employeeNumber;
        private String firstName;
        private String lastName;
        private String email;
        private Address address;
        private Job job;

        public Employee.Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.email = employee.email;
            this.address = employee.address;
            this.job = employee.job;
            return this;
        }


        public Builder setEmployeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAddress(Address address){
            this.address = address;
            return this;
        }
        public Builder setJob(Job job){
            this.job = job;
            return this;
        }
        public Employee build(){

            return new Employee(this);
        }

    }
}