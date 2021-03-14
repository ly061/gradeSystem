package com.grade.total.po;

public class TotalPo {
    private Integer id;
    private String stuId;
    private Double actTotal;
    private Double innoTotal;
    private Double lecTotal;
    private Double readTotal;
    private Double Total;

    @Override
    public String toString() {
        return "TotalPo{" +
                "id=" + id +
                ", actTotal=" + actTotal +
                ", innoTotal=" + innoTotal +
                ", lecTotal=" + lecTotal +
                ", readTotal=" + readTotal +
                ", Total=" + Total +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getActTotal() {
        return actTotal;
    }

    public void setActTotal(Double actTotal) {
        this.actTotal = actTotal;
    }

    public Double getInnoTotal() {
        return innoTotal;
    }

    public void setInnoTotal(Double innoTotal) {
        this.innoTotal = innoTotal;
    }

    public Double getLecTotal() {
        return lecTotal;
    }

    public void setLecTotal(Double lecTotal) {
        this.lecTotal = lecTotal;
    }

    public Double getReadTotal() {
        return readTotal;
    }

    public void setReadTotal(Double readTotal) {
        this.readTotal = readTotal;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }
}
