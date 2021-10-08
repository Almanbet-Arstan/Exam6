package com.company.TaskA;

public class Student {
    private Long id;
    private String name;
    private Float averageRating;
    private Integer age;
    private String gender;

    public Student(Long id, String name, Float averageRating, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.averageRating = averageRating;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Float averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageRating=" + averageRating +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
