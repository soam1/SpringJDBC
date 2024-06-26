package org.example;

public class Student {
    private String id;
    private String name;
    private String city;

    public Student() {
        super();
    }

    public Student(String id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
    }

    //getter and setter methods
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
}
