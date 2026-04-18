package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Job;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.JobFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class JobRepositoryTest {
    private static IJobRepository repository = JobRepository.getRepository();

    Job job = JobFactory.createJob("JB2345",
            "Developer",
            " Senior Backend developer",
            "Full time");

    @Test
    void a_create() {
        Job created = repository.create(job);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
        Job read = repository.read(job.getJobNumber());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Job newJob = new Job.Builder()
                .copy(job)
                .setJobTitle("Backend Developer")
                .setJobDescription("Lead Backend Developer")
                .build();
        Job updated = repository.update(newJob);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(job.getJobNumber()));
        System.out.println("Success: job deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}