/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author TGDD
 */
public class Report {
    int id;
    int uid;
    String fullname;
    String content;
    Timestamp SendTime;
    String status;

    public Report(int uid, String content, Timestamp SendTime, String fullname, String status, int id) {
        this.uid = uid;
        this.content = content;
        this.SendTime = SendTime;
        this.fullname = fullname;
        this.status = status;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getSendTime() {
        return SendTime;
    }

    public void setSendTime(Timestamp SendTime) {
        this.SendTime = SendTime;
    }
    
}
