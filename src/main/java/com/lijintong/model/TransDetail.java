package com.lijintong.model;

import java.util.Date;

public class TransDetail {
    private int trans_id;
    private int cust_id;
    private String account;
    private String card_nbr;
    private int tranno;
    private int month_nbr;
    private Double bill;
    private String trans_type;
    private Date txn_datetime;

    public TransDetail() {
    }

    public TransDetail(int trans_id, int cust_id, String account, String card_nbr, int tranno, int month_nbr, Double bill, String trans_type, Date txn_datetime) {
        this.trans_id = trans_id;
        this.cust_id = cust_id;
        this.account = account;
        this.card_nbr = card_nbr;
        this.tranno = tranno;
        this.month_nbr = month_nbr;
        this.bill = bill;
        this.trans_type = trans_type;
        this.txn_datetime = txn_datetime;
    }

    public int getTrans_id() {
        return trans_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public String getAccount() {
        return account;
    }

    public String getCard_nbr() {
        return card_nbr;
    }

    public int getTranno() {
        return tranno;
    }

    public int getMonth_nbr() {
        return month_nbr;
    }

    public double getBill() {
        return bill;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public Date getTxn_datetime() {
        return txn_datetime;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setCard_nbr(String card_nbr) {
        this.card_nbr = card_nbr;
    }

    public void setTranno(int tranno) {
        this.tranno = tranno;
    }

    public void setMonth_nbr(int month_nbr) {
        this.month_nbr = month_nbr;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public void setTxn_datetime(Date txn_datetime) {
        this.txn_datetime = txn_datetime;
    }

    @Override
    public String toString() {
        return "transDetail{" +
                "trans_id=" + trans_id +
                ", cust_id=" + cust_id +
                ", account='" + account + '\'' +
                ", card_nbr='" + card_nbr + '\'' +
                ", tranno=" + tranno +
                ", month_nbr=" + month_nbr +
                ", bill=" + bill +
                ", trans_type='" + trans_type + '\'' +
                ", txn_datetime=" + txn_datetime +
                '}';
    }
}
