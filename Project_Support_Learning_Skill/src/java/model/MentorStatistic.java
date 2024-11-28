/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TGDD
 */
public class MentorStatistic {
    int id;
    int invitedRequest, accepedRequest, rejectedRequest;
    float rejectPercent, completePercent;
    float rating;

    public MentorStatistic() {
    }

    public MentorStatistic(int id, int invitedRequest, int accepedRequest, int rejectedRequest, float rejectPercent, float completePercent, float rating) {
        this.id = id;
        this.invitedRequest = invitedRequest;
        this.accepedRequest = accepedRequest;
        this.rejectedRequest = rejectedRequest;
        this.rejectPercent = rejectPercent;
        this.completePercent = completePercent;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvitedRequest() {
        return invitedRequest;
    }

    public void setInvitedRequest(int invitedRequest) {
        this.invitedRequest = invitedRequest;
    }

    public int getAccepedRequest() {
        return accepedRequest;
    }

    public void setAccepedRequest(int accepedRequest) {
        this.accepedRequest = accepedRequest;
    }

    public int getRejectedRequest() {
        return rejectedRequest;
    }

    public void setRejectedRequest(int rejectedRequest) {
        this.rejectedRequest = rejectedRequest;
    }

    public float getRejectPercent() {
        return rejectPercent;
    }

    public void setRejectPercent(float rejectPercent) {
        this.rejectPercent = rejectPercent;
    }

    public float getCompletePercent() {
        return completePercent;
    }

    public void setCompletePercent(float completePercent) {
        this.completePercent = completePercent;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
