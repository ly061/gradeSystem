package com.grade.lecture.po;

public class LectureGrade {
    private Integer id;
    private String lecId;
    private String lecVar;
    private String lecName;
    private String lecContent;
    private String lecDate;
    private String lecRank;
    private String lecValue;

    @Override
    public String toString() {
        return "LectureGrade{" +
                "id=" + id +
                ", lecId='" + lecId + '\'' +
                ", lecVar='" + lecVar + '\'' +
                ", lecName='" + lecName + '\'' +
                ", lecContent='" + lecContent + '\'' +
                ", lecDate='" + lecDate + '\'' +
                ", lecRank='" + lecRank + '\'' +
                ", lecValue='" + lecValue + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLecId() {
        return lecId;
    }

    public void setLecId(String lecId) {
        this.lecId = lecId;
    }

    public String getLecVar() {
        return lecVar;
    }

    public void setLecVar(String lecVar) {
        this.lecVar = lecVar;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getLecContent() {
        return lecContent;
    }

    public void setLecContent(String lecContent) {
        this.lecContent = lecContent;
    }

    public String getLecDate() {
        return lecDate;
    }

    public void setLecDate(String lecDate) {
        this.lecDate = lecDate;
    }

    public String getLecRank() {
        return lecRank;
    }

    public void setLecRank(String lecRank) {
        this.lecRank = lecRank;
    }

    public String getLecValue() {
        return lecValue;
    }

    public void setLecValue(String lecValue) {
        this.lecValue = lecValue;
    }
}
