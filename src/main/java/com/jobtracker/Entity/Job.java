package com.jobtracker.Entity;

/**
 * Created by michaelscherer on 4/6/17.
 */
public class Job {

    private int id;
    private String name;
    private String company;

    public Job(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public Job(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

