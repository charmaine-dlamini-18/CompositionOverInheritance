package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Job;

import static org.junit.jupiter.api.Assertions.*;

class JobFactoryTest {

    @Test
    void createJob() {
        Job j = JobFactory.createJob("JB2345",
                "Developer",
                " Senior Backend developer",
                "Full time");
        assertNotNull(j);
        System.out.println(j);
    }
}