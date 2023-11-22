package vn.edu.iuh.fit.models;


import org.springframework.data.annotation.Id;

public class Job {
    @Id
    private long job_id;
    private String title;
    private String description;
    private String location;

    public Job() {
    }

    public Job(long job_id, String title, String description, String location) {
        this.job_id = job_id;
        this.title = title;
        this.description = description;
        this.location = location;
    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}