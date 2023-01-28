package com.nix.tryout.jsonxml;

public class Subject {
    private String subjectId;
    private String subjectName;

    public Subject(String id, String name) {
        this.subjectId = id;
        this.subjectName = name;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject : " + this.subjectName;
    }
}
