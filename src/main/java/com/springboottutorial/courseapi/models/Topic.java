package com.springboottutorial.courseapi.models;

public class Topic {

    private String id;
    private String name;
    private String descriptor;

    public Topic() {}
    
    public Topic(String id, String name, String descriptor) {
        this.id = id;
        this.name = name;
        this.descriptor = descriptor;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

}
