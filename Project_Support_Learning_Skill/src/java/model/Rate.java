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
public class Rate {
    int senderID, mentorID;
    int noStar;
    String senderName, senderAvatar;
    String content;
    Timestamp rateTime;
    int requestID;

    public Rate(int senderID, int mentorID, int noStar, String senderName, String senderAvatar, String content, Timestamp rateTime, int requestID) {
        this.senderID = senderID;
        this.mentorID = mentorID;
        this.noStar = noStar;
        this.senderName = senderName;
        this.senderAvatar = senderAvatar;
        this.content = content;
        this.rateTime = rateTime;
        this.requestID = requestID;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public int getNoStar() {
        return noStar;
    }

    public void setNoStar(int noStar) {
        this.noStar = noStar;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAvatar() {
        return senderAvatar;
    }

    public void setSenderAvatar(String senderAvatar) {
        this.senderAvatar = senderAvatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getRateTime() {
        return rateTime;
    }

    public void setRateTime(Timestamp rateTime) {
        this.rateTime = rateTime;
    }
}
