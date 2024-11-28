/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class Request {
    int id, senderID, userID;
    String mentor;
    String sender;
    String reason, status, subject;
    String rejectReason;
    Timestamp DeadlineTime;
    Timestamp requestTime;
    boolean rated = false;
    ArrayList<Skill> skills = new ArrayList();

    public Request(int id, int senderID, int userID, String reason, String status, String subject, Timestamp requestTime, Timestamp DeadlineTime) {
        this.id = id;
        this.senderID = senderID;
        this.userID = userID;
        this.reason = reason;
        this.status = status;
        this.subject = subject;
        this.requestTime = requestTime;
        this.DeadlineTime = DeadlineTime;
    }

    public boolean isRated() {
        return rated;
    }

    public void setRated(boolean rated) {
        this.rated = rated;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public String getSkillsName() {
        String name = "";
        for (int i = 0; i < getSkills().size() - 1; i++) {
            name += getSkills().get(i).getName() + ", ";
        }
        name += getSkills().get(getSkills().size() - 1).getName();
        return name;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    public Timestamp getDeadlineTime() {
        return DeadlineTime;
    }

    public void setDeadlineTime(Timestamp DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

}
