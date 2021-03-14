package com.grade.read.po;

public class ReadGrade {
    private Integer id;
    private String readId;  //编号
    private String readVar;
    private String readName;
    private String readContent;
    private String readDate;
    private String readRank;
    private String readValue;

    @Override
    public String toString() {
        return "ReadGrade{" +
                "id=" + id +
                ", readId='" + readId + '\'' +
                ", readVar='" + readVar + '\'' +
                ", readName='" + readName + '\'' +
                ", readContent='" + readContent + '\'' +
                ", readDate='" + readDate + '\'' +
                ", readRank='" + readRank + '\'' +
                ", readValue='" + readValue + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReadId() {
        return readId;
    }

    public void setReadId(String readId) {
        this.readId = readId;
    }

    public String getReadVar() {
        return readVar;
    }

    public void setReadVar(String readVar) {
        this.readVar = readVar;
    }

    public String getReadName() {
        return readName;
    }

    public void setReadName(String readName) {
        this.readName = readName;
    }

    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
    }

    public String getReadDate() {
        return readDate;
    }

    public void setReadDate(String readDate) {
        this.readDate = readDate;
    }

    public String getReadRank() {
        return readRank;
    }

    public void setReadRank(String readRank) {
        this.readRank = readRank;
    }

    public String getReadValue() {
        return readValue;
    }

    public void setReadValue(String readValue) {
        this.readValue = readValue;
    }
}
