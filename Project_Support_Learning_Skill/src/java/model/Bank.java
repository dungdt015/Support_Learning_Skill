/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TGDD
 */
public class Bank {
    int id;
    String BankName, BankNo, BankType;

    public Bank(int id, String BankName, String BankNo, String BankType) {
        this.id = id;
        this.BankName = BankName;
        this.BankNo = BankNo;
        this.BankType = BankType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankNo() {
        return BankNo;
    }

    public void setBankNo(String BankNo) {
        this.BankNo = BankNo;
    }

    public String getBankType() {
        return BankType;
    }

    public void setBankType(String BankType) {
        this.BankType = BankType;
    }
}
