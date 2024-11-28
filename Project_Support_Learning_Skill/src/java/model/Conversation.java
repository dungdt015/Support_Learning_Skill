/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author TGDD
 */
public class Conversation {
    int id;
    int mentorID;
    int menteeID;
    String lastMsg;
    Timestamp lastTime;
    String avatar;
    String fullName;
    int userID;

    public Conversation(int id, int mentorID, int menteeID) {
        this.id = id;
        this.mentorID = mentorID;
        this.menteeID = menteeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }

    public Timestamp getLastTime() {
        return lastTime;
    }
    
    public String lastTimeFormat() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy, hh:mm:ss a");
        String formattedDate = formatter.format(new java.util.Date(lastTime.getTime()));
        return formattedDate;
    }

    public void setLastTime(Timestamp lastTime) {
        this.lastTime = lastTime;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public int getMenteeID() {
        return menteeID;
    }

    public void setMenteeID(int menteeID) {
        this.menteeID = menteeID;
    }
    
}
