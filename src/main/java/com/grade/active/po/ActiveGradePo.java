package com.grade.active.po;

public class ActiveGradePo {
    private Integer id;
    private String actId;
    private String actVar;
    private String actName;
    private String actContent;  //活动内容
    private String actDate;
    private String actRank; //等级
    private String actLevel;  //几等奖
    private String actValue;

    @Override
    public String toString() {
        return "ActiveGradePo{" +
                "id=" + id +
                ", actId='" + actId + '\'' +
                ", actVar='" + actVar + '\'' +
                ", actName='" + actName + '\'' +
                ", actContent='" + actContent + '\'' +
                ", actDate='" + actDate + '\'' +
                ", actRank='" + actRank + '\'' +
                ", actLevel='" + actLevel + '\'' +
                ", actValue='" + actValue + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getActVar() {
        return actVar;
    }

    public void setActVar(String actVar) {
        this.actVar = actVar;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent;
    }

    public String getActDate() {
        return actDate;
    }

    public void setActDate(String actDate) {
        this.actDate = actDate;
    }

    public String getActRank() {
        return actRank;
    }

    public void setActRank(String actRank) {
        this.actRank = actRank;
    }

    public String getActLevel() {
        return actLevel;
    }

    public void setActLevel(String actLevel) {
        this.actLevel = actLevel;
    }

    public String getActValue() {
        return actValue;
    }

    public void setActValue(String actValue) {
        this.actValue = actValue;
    }
}
