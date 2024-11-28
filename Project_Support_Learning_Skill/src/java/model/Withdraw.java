/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TGDD
 */
public class Withdraw {
    int id;
    String account;
    String fullname;
    String BankName;
    String BankAccountName;
    String BankNo, Status;
    int balance;

    public Withdraw(int id, String account, String fullname, String BankName, String BankAccountName, String BankNo, int balance, String Status) {
        this.id = id;
        this.account = account;
        this.fullname = fullname;
        this.BankName = BankName;
        this.BankAccountName = BankAccountName;
        this.BankNo = BankNo;
        this.balance = balance;
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankAccountName() {
        return BankAccountName;
    }

    public void setBankAccountName(String BankAccountName) {
        this.BankAccountName = BankAccountName;
    }

    public String getBankNo() {
        return BankNo;
    }

    public void setBankNo(String BankNo) {
        this.BankNo = BankNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
