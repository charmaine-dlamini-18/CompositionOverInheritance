
package za.ac.cput.domain;

public class Job {
    //Attributes
    private String jobNumber;
    private String jobTitle;
    private String jobDescription;
    private String jobType;

    private Job(){

    }
    private Job(Builder builder){
        this.jobNumber = builder.jobNumber;
        this.jobTitle = builder.jobTitle;
        this.jobDescription = builder.jobDescription;
        this.jobType = builder.jobType;

    }
    public String getJobNumber() {
        return jobNumber;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public String getJobType() {
        return jobType;
    }

    @Override
    public String toString() {
        return
                "\nJob Number: " + jobNumber +
                        "\nJob Title: " + jobTitle +
                        "\nJob Description: " + jobDescription +
                        "\nJob Type: " + jobType;
    }

    public static class Builder{
        private String jobNumber;
        private String jobTitle;
        private String jobDescription;
        private String jobType;

        public Job.Builder copy(Job job){
            this.jobNumber = job.jobNumber;
            this.jobTitle = job.jobTitle;
            this.jobDescription = job.jobDescription;
            this.jobType = job.jobType;
            return this;
        }


        public Builder setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }

        public Builder setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public Job build(){
            return new Job(this);
        }
    }
}
