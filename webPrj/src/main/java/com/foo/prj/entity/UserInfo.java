package com.foo.prj.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
public class UserInfo {
    private int userId;
    private String userName;
    private String password;
    private String lastVisit;
    private String lastIp;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "last_visit")
    public String getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(String lastVisit) {
        this.lastVisit = lastVisit;
    }

    @Basic
    @Column(name = "last_ip")
    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (userId != userInfo.userId) return false;
        if (userName != null ? !userName.equals(userInfo.userName) : userInfo.userName != null) return false;
        if (password != null ? !password.equals(userInfo.password) : userInfo.password != null) return false;
        if (lastVisit != null ? !lastVisit.equals(userInfo.lastVisit) : userInfo.lastVisit != null) return false;
        if (lastIp != null ? !lastIp.equals(userInfo.lastIp) : userInfo.lastIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (lastVisit != null ? lastVisit.hashCode() : 0);
        result = 31 * result + (lastIp != null ? lastIp.hashCode() : 0);
        return result;
    }
}
