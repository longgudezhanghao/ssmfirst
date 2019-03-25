package com.dzf.pojo;

public class AppAcount {

    private Integer id;

    private String number;

    private String discription;

    public AppAcount() {
    }

    public AppAcount(Integer id, String number, String discription) {
        this.id = id;
        this.number = number;
        this.discription = discription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
