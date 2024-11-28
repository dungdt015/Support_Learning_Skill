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
public class Slot {
    int id;
    Timestamp SlotTime;
    float hour;
    String link;
    String skill;
    String mentee, mentor, Status;
    int menteeId, mentorId;

    public Slot(int id, Timestamp SlotTime, float hour, String link, String mentor, int mentorId) {
        this.id = id;
        this.SlotTime = SlotTime;
        this.hour = hour;
        this.link = link;
        this.mentor = mentor;
        this.mentorId = mentorId;
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

    public Timestamp getSlotTime() {
        return SlotTime;
    }

    public void setSlotTime(Timestamp SlotTime) {
        this.SlotTime = SlotTime;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getMentee() {
        return mentee;
    }

    public void setMentee(String mentee) {
        this.mentee = mentee;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public int getMenteeId() {
        return menteeId;
    }

    public void setMenteeId(int menteeId) {
        this.menteeId = menteeId;
    }

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    
    
}
