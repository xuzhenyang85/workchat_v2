/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.user;

/**
 *
 * @author danny
 */
public class MessageLog {

    int id;
    String msg;
    String fk_userId;
    int fk_groupId;
    String timestamp;

    public MessageLog(int id, String msg, String fk_userId, int fk_groupId, String timestamp) {
        this.id = id;
        this.msg = msg;
        this.fk_userId = fk_userId;
        this.fk_groupId = fk_groupId;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getFk_userId() {
        return fk_userId;
    }

    public void setFk_userId(String fk_userId) {
        this.fk_userId = fk_userId;
    }

    public int getFk_groupId() {
        return fk_groupId;
    }

    public void setFk_groupId(int fk_groupId) {
        this.fk_groupId = fk_groupId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
