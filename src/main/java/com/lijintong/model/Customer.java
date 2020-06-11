package com.lijintong.model;

public class Customer {
    private int cust_id;
    private String surname;
    private String gender;
    private String educa_des;
    private String mar_des;
    private int birthday;
    private String address;

    public Customer() {
    }

    public Customer(int cust_id, String surname, String gender, String educa_des, String mar_des, int birthday, String address) {
        this.cust_id = cust_id;
        this.surname = surname;
        this.gender = gender;
        this.educa_des = educa_des;
        this.mar_des = mar_des;
        this.birthday = birthday;
        this.address = address;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEduca_des(String educa_des) {
        this.educa_des = educa_des;
    }

    public void setMar_des(String mar_des) {
        this.mar_des = mar_des;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCust_id() {
        return cust_id;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getEduca_des() {
        return educa_des;
    }

    public String getMar_des() {
        return mar_des;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", educa_des='" + educa_des + '\'' +
                ", mar_des='" + mar_des + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
