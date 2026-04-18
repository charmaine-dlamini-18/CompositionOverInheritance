package za.ac.cput.repository;

import za.ac.cput.domain.Job;
import java.util.List;

public interface IJobRepository extends IRepository<Job, String>{
    List<Job> getAll();
}
