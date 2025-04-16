package com.example.g2app.struct;

public class Course {
    String name;
    Double grade, credit,coefficient;

    public Course(String name, Double grade, Double credit, Double coefficient) {
        this.name = name;
        this.grade = grade;
        this.credit = credit;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }
}
