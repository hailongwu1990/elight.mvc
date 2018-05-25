package com.elight.model;

import java.util.Date;

public class SYS_USER_LOGON {
    private Integer id;

    private String userId;

    private String password;

    private String secretkey;

    private Date prevvisitTime;

    private Date lastvisitTime;

    private Date changepwdTime;

    private Integer loginCount;

    private Boolean allowMultiuseronLine;

    private Boolean isOnline;

    private String question;

    private String answerQuestion;

    private Boolean checkIpAddress;

    private String language;

    private String theme;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey == null ? null : secretkey.trim();
    }

    public Date getPrevvisitTime() {
        return prevvisitTime;
    }

    public void setPrevvisitTime(Date prevvisitTime) {
        this.prevvisitTime = prevvisitTime;
    }

    public Date getLastvisitTime() {
        return lastvisitTime;
    }

    public void setLastvisitTime(Date lastvisitTime) {
        this.lastvisitTime = lastvisitTime;
    }

    public Date getChangepwdTime() {
        return changepwdTime;
    }

    public void setChangepwdTime(Date changepwdTime) {
        this.changepwdTime = changepwdTime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Boolean getAllowMultiuseronLine() {
        return allowMultiuseronLine;
    }

    public void setAllowMultiuseronLine(Boolean allowMultiuseronLine) {
        this.allowMultiuseronLine = allowMultiuseronLine;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswerQuestion() {
        return answerQuestion;
    }

    public void setAnswerQuestion(String answerQuestion) {
        this.answerQuestion = answerQuestion == null ? null : answerQuestion.trim();
    }

    public Boolean getCheckIpAddress() {
        return checkIpAddress;
    }

    public void setCheckIpAddress(Boolean checkIpAddress) {
        this.checkIpAddress = checkIpAddress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }
}