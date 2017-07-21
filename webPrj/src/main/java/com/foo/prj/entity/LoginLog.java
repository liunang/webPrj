package com.foo.prj.entity;

import javax.persistence.*;

@Entity
@Table(name = "login_log")
public class LoginLog {
    private int loginLogId;
    private Integer userId;
    private String ip;
    private String loginDatetime;

    @Id
    @Column(name = "login_log_id")
    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "login_datetime")
    public String getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(String loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginLog loginLog = (LoginLog) o;

        if (loginLogId != loginLog.loginLogId) return false;
        if (userId != null ? !userId.equals(loginLog.userId) : loginLog.userId != null) return false;
        if (ip != null ? !ip.equals(loginLog.ip) : loginLog.ip != null) return false;
        if (loginDatetime != null ? !loginDatetime.equals(loginLog.loginDatetime) : loginLog.loginDatetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loginLogId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (loginDatetime != null ? loginDatetime.hashCode() : 0);
        return result;
    }
}
