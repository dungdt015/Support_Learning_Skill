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
public class Message {
    int id;
    int cid;
    int senderID;
    Timestamp sendAt;
    String msgContent;

    public Message(int id, int cid, int senderID, Timestamp sendAt, String msgContent) {
        this.id = id;
        this.cid = cid;
        this.senderID = senderID;
        this.sendAt = sendAt;
        this.msgContent = msgContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public Timestamp getSendAt() {
        return sendAt;
    }
    
    public String sendAtFormat() {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy, hh:mm:ss a");
        String formattedDate = formatter.format(new java.util.Date(sendAt.getTime()));
        return formattedDate;
    }

    public void setSendAt(Timestamp sendAt) {
        this.sendAt = sendAt;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
}
