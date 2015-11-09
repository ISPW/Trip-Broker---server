package model;


import javafx.stage.Stage;

public class Employee {

    private Job job;
    private String name;

    public Employee(String name, Job job) {

        this.name = name;
        this.job = job;
    }

    public Stage generateState() {

        return job.generateInterface();
    }

    public String getName() {
        return name;
    }
}
