package com.grade.innovation.po;

public class InnoGrade {
    private Integer id;
    private String innoId;
    private String innoVar;
    private String innoName;
    private String innoContent;
    private String innoDate;
    private String innoRank;
    private String innoLevel;
    private String innoValue;

    @Override
    public String toString() {
        return "InnoGrade{" +
                "id=" + id +
                ", innoId='" + innoId + '\'' +
                ", innoVar='" + innoVar + '\'' +
                ", innoName='" + innoName + '\'' +
                ", innoContent='" + innoContent + '\'' +
                ", innoDate='" + innoDate + '\'' +
                ", innoRank='" + innoRank + '\'' +
                ", innoLevel='" + innoLevel + '\'' +
                ", innoValue='" + innoValue + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInnoId() {
        return innoId;
    }

    public void setInnoId(String innoId) {
        this.innoId = innoId;
    }

    public String getInnoVar() {
        return innoVar;
    }

    public void setInnoVar(String innoVar) {
        this.innoVar = innoVar;
    }

    public String getInnoName() {
        return innoName;
    }

    public void setInnoName(String innoName) {
        this.innoName = innoName;
    }

    public String getInnoContent() {
        return innoContent;
    }

    public void setInnoContent(String innoContent) {
        this.innoContent = innoContent;
    }

    public String getInnoDate() {
        return innoDate;
    }

    public void setInnoDate(String innoDate) {
        this.innoDate = innoDate;
    }

    public String getInnoRank() {
        return innoRank;
    }

    public void setInnoRank(String innoRank) {
        this.innoRank = innoRank;
    }

    public String getInnoLevel() {
        return innoLevel;
    }

    public void setInnoLevel(String innoLevel) {
        this.innoLevel = innoLevel;
    }

    public String getInnoValue() {
        return innoValue;
    }

    public void setInnoValue(String innoValue) {
        this.innoValue = innoValue;
    }
}
