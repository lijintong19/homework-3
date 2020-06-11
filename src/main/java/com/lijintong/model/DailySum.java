package com.lijintong.model;

import java.util.Date;

public class DailySum {
    private int s_index;
    private int cust_id;
    private Date update_time;
    private Date trans_date;
    private String surname;
    private double tran_max_amt;
    private double pay_amt;
    private int tran_cnt;
    private int pay_cut;
    private double tran_amt;

    public DailySum() {
    }

    public DailySum(int s_index, int cust_id, Date update_time, Date trans_date, String surname, double tran_max_amt, double pay_amt, int tran_cnt, int pay_cut, double tran_amt) {
        this.s_index = s_index;
        this.cust_id = cust_id;
        this.update_time = update_time;
        this.trans_date = trans_date;
        this.surname = surname;
        this.tran_max_amt = tran_max_amt;
        this.pay_amt = pay_amt;
        this.tran_cnt = tran_cnt;
        this.pay_cut = pay_cut;
        this.tran_amt = tran_amt;
    }

    public void setS_index(int s_index) {
        this.s_index = s_index;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public void setTrans_date(Date trans_date) {
        this.trans_date = trans_date;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTran_max_amt(double tran_max_amt) {
        this.tran_max_amt = tran_max_amt;
    }

    public void setPay_amt(double pay_amt) {
        this.pay_amt = pay_amt;
    }

    public void setTran_cnt(int tran_cnt) {
        this.tran_cnt = tran_cnt;
    }

    public void setPay_cut(int pay_cut) {
        this.pay_cut = pay_cut;
    }

    public void setTran_amt(double tran_amt) {
        this.tran_amt = tran_amt;
    }

    public int getS_index() {

        return s_index;
    }

    public int getCust_id() {
        return cust_id;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public Date getTrans_date() {
        return trans_date;
    }

    public String getSurname() {
        return surname;
    }

    public double getTran_max_amt() {
        return tran_max_amt;
    }

    public double getPay_amt() {
        return pay_amt;
    }

    public int getTran_cnt() {
        return tran_cnt;
    }

    public int getPay_cut() {
        return pay_cut;
    }

    public double getTran_amt() {
        return tran_amt;
    }

    @Override
    public String toString() {
        return "DailySum{" +
                "s_index=" + s_index +
                ", cust_id=" + cust_id +
                ", update_time=" + update_time +
                ", trans_date=" + trans_date +
                ", surname='" + surname + '\'' +
                ", tran_max_amt=" + tran_max_amt +
                ", pay_amt=" + pay_amt +
                ", tran_cnt=" + tran_cnt +
                ", pay_cut=" + pay_cut +
                ", tran_amt=" + tran_amt +
                '}';
    }
}
