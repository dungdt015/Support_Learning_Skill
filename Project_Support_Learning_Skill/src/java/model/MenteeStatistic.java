/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TGDD
 */
public class MenteeStatistic {
    int id;
    float totalHours;
    int totalSkill, totalRequest, acceptedRequest, rejectedRequest, totalMentor;
    String name;
    String fullname;

    public MenteeStatistic() {
    }

    public MenteeStatistic(int id, float totalHours, int totalSkill, int totalRequest, int acceptedRequest, int rejectedRequest, String name, String fullname) {
        this.id = id;
        this.totalHours = totalHours;
        this.totalSkill = totalSkill;
        this.totalRequest = totalRequest;
        this.acceptedRequest = acceptedRequest;
        this.rejectedRequest = rejectedRequest;
        this.name = name;
        this.fullname = fullname;
    }

    public int getTotalMentor() {
        return totalMentor;
    }

    public void setTotalMentor(int totalMentor) {
        this.totalMentor = totalMentor;
    }

    public int getTotalRequest() {
        return totalRequest;
    }

    public void setTotalRequest(int totalRequest) {
        this.totalRequest = totalRequest;
    }

    public int getAcceptedRequest() {
        return acceptedRequest;
    }

    public void setAcceptedRequest(int acceptedRequest) {
        this.acceptedRequest = acceptedRequest;
    }

    public int getRejectedRequest() {
        return rejectedRequest;
    }

    public void setRejectedRequest(int rejectedRequest) {
        this.rejectedRequest = rejectedRequest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(float totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalSkill() {
        return totalSkill;
    }

    public void setTotalSkill(int totalSkill) {
        this.totalSkill = totalSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
