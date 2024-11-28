/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author TGDD
 */
public class MentorDetail {
    int id;
    int rating;
    int acceptedRequest;
    int percentComplete;
    int requests;
    String account;
    String profession;
    boolean status;

    public MentorDetail(int id, int rating, int acceptedRequest, int percentComplete, String account, String profession, boolean status) {
        this.id = id;
        this.rating = rating;
        this.acceptedRequest = acceptedRequest;
        this.percentComplete = percentComplete;
        this.account = account;
        this.profession = profession;
        this.status = status;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAcceptedRequest() {
        return acceptedRequest;
    }

    public void setAcceptedRequest(int acceptedRequest) {
        this.acceptedRequest = acceptedRequest;
    }

    public int getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(int percentComplete) {
        this.percentComplete = percentComplete;
    }
    
}
