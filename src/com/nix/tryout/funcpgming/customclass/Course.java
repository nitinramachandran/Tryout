package com.nix.tryout.funcpgming.customclass;

import java.util.Objects;

public class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return  name +", " + noOfStudents + ", " + reviewScore + "\n";
    }

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public Course() {
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course courses = (Course) o;
        return reviewScore == courses.reviewScore && noOfStudents == courses.noOfStudents && Objects.equals(name, courses.name) && Objects.equals(category, courses.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, reviewScore, noOfStudents);
    }
}
