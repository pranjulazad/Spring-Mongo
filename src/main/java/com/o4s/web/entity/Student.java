package com.o4s.web.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
    private String name;
    private String enroll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enroll='" + enroll + '\'' +
                '}';
    }
}
