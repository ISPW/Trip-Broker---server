package model;


import javafx.stage.Stage;

public class Employee {

    private Job job;

    public Employee(Job job) {

        this.job = job;
    }

    public Stage generateState() {

        return job.generateInterface();
    }
}
