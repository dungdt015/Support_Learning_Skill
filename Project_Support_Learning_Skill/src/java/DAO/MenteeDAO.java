/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DataConnector.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.MenteeStatistic;
import model.Mentor;

/**
 *
 * @author TGDD
 */
public class MenteeDAO {

    public static MenteeStatistic getMenteeStatistic(int uid) {
        MenteeStatistic ms = null;
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("SELECT [UserID]\n"
                    + "      ,[sex]\n"
                    + "      ,[activeStatus]\n"
                    + "      ,[username]\n"
                    + "      ,[password]\n"
                    + "      ,[dob]\n"
                    + "      ,[email]\n"
                    + "      ,[phoneNumber]\n"
                    + "      ,[wallet]\n"
                    + "      ,[address]\n"
                    + "      ,[RoleID]\n"
                    + "      ,[isValidate]\n"
                    + "      ,[Avatar]\n"
                    + "      ,[fullname], (SELECT Count([RequestID]) FROM [Request] WHERE [SenderID] = [User].[UserID]) as TotalRequest, (SELECT Count([SkillID]) FROM [Slot] WHERE [MenteeID] = [User].[UserID]) as TotalSkill, (SELECT Sum([Time]) FROM [Slot] WHERE [MenteeID] = [User].[UserID]) as TotalHour, (SELECT Count([RequestID]) FROM [RejectRequest] WHERE [RequestID] in (SELECT [RequestID] FROM [Request] WHERE [SenderID] = [User].[UserID])) as RejectedRequest, (SELECT Count([RequestID]) FROM [Request] WHERE [SenderID] = [User].[UserID] AND [RequestStatus] != N'Open' AND [RequestStatus] != N'Close' AND [RequestStatus] != N'Reject') as AcceptedRequest, (SELECT Count(UserID) FROM [Request] WHERE [SenderID] = [User].[UserID]) as TotalMentor FROM [User] WHERE [UserID] = ?");
            ps.setInt(1, uid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ms = new MenteeStatistic();
                ms.setId(rs.getInt("UserID"));
                ms.setName(rs.getString("username"));
                ms.setFullname(rs.getString("fullname"));
                ms.setTotalHours(rs.getFloat("TotalHour"));
                ms.setTotalRequest(rs.getInt("TotalRequest"));
                ms.setTotalSkill(rs.getInt("TotalSkill"));
                ms.setAcceptedRequest(rs.getInt("AcceptedRequest"));
                ms.setRejectedRequest(rs.getInt("RejectedRequest"));
                ms.setTotalMentor(rs.getInt("TotalMentor"));
            }
            dbo.close();
        } catch (Exception e) {
        }
        return ms;
    }

    public static ArrayList<MenteeStatistic> getMenteeStatistic() {
        ArrayList<MenteeStatistic> arr = new ArrayList();
        Connection dbo = DatabaseUtil.getConn();
        try {
            PreparedStatement ps = dbo.prepareStatement("SELECT [UserID]\n"
                    + "      ,[sex]\n"
                    + "      ,[activeStatus]\n"
                    + "      ,[username]\n"
                    + "      ,[password]\n"
                    + "      ,[dob]\n"
                    + "      ,[email]\n"
                    + "      ,[phoneNumber]\n"
                    + "      ,[wallet]\n"
                    + "      ,[address]\n"
                    + "      ,[RoleID]\n"
                    + "      ,[isValidate]\n"
                    + "      ,[Avatar]\n"
                    + "      ,[fullname], (SELECT Count([RequestID]) FROM [Request] WHERE [SenderID] = [User].[UserID]) as TotalRequest, (SELECT Count([SkillID]) FROM [Slot] WHERE [MenteeID] = [User].[UserID]) as TotalSkill, (SELECT Sum([Time]) FROM [Slot] WHERE [MenteeID] = [User].[UserID]) as TotalHour, (SELECT Count([RequestID]) FROM [RejectRequest] WHERE [RequestID] in (SELECT [RequestID] FROM [Request] WHERE [SenderID] = [User].[UserID])) as RejectedRequest, (SELECT Count([RequestID]) FROM [Request] WHERE [SenderID] = [User].[UserID] AND [RequestStatus] != N'Open' AND [RequestStatus] != N'Close' AND [RequestStatus] != N'Reject') as AcceptedRequest FROM [User] WHERE [UserID] in (Select [UserID] FROM [Mentee])");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MenteeStatistic ms = new MenteeStatistic();
                ms.setId(rs.getInt("UserID"));
                ms.setName(rs.getString("username"));
                ms.setFullname(rs.getString("fullname"));
                ms.setTotalHours(rs.getFloat("TotalHour"));
                ms.setTotalRequest(rs.getInt("TotalRequest"));
                ms.setTotalSkill(rs.getInt("TotalSkill"));
                ms.setAcceptedRequest(rs.getInt("AcceptedRequest"));
                ms.setRejectedRequest(rs.getInt("RejectedRequest"));
                arr.add(ms);
            }
            dbo.close();
        } catch (Exception e) {
        }
        return arr;
    }
}
