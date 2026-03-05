
package za.ac.cput.factory;
import za.ac.cput.domain.Job;
import za.ac.cput.util.Helper;


public class JobFactory {
    public static Job createJob(String jobNumber,
                                String jobTitle,
                                String jobDescription,
                                String jobType) {

        if(Helper.isNull(jobNumber)
                || Helper.isNull(jobTitle)
                || Helper.isNull(jobDescription)
                || Helper.isNull(jobType)
        ){
            return null;
        }
        return new Job.Builder()
                .setJobNumber(jobNumber)
                .setJobTitle(jobTitle)
                .setJobDescription(jobDescription)
                .setJobType(jobType)
                .build();
    }
}
