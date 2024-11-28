/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author TGDD
 */
public class CV {
    int id;
    String ProfessionIntroduction;
    String ServiceDescription;
    int cashPerSlot;
    ArrayList<Skill> skills = new ArrayList();

    public CV(int id, String ProfessionIntroduction, String ServiceDescription) {
        this.id = id;
        this.ProfessionIntroduction = ProfessionIntroduction;
        this.ServiceDescription = ServiceDescription;
    }
    
    public String CashFormat() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        return decimalFormat.format(cashPerSlot);
    }

    public int getCashPerSlot() {
        return cashPerSlot;
    }

    public void setCashPerSlot(int cashPerSlot) {
        this.cashPerSlot = cashPerSlot;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
    
    public String getSkillString() {
        String ret = "";
        for (int i = 0; i < skills.size(); i++) {
            ret += skills.get(i).getName();
            if(i != skills.size() - 1) {
                ret += ", ";
            }
        }
        return ret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfessionIntroduction() {
        return ProfessionIntroduction;
    }

    public void setProfessionIntroduction(String ProfessionIntroduction) {
        this.ProfessionIntroduction = ProfessionIntroduction;
    }

    public String getServiceDescription() {
        return ServiceDescription;
    }

    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }
}
