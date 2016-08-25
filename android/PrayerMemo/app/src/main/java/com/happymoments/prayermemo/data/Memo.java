package com.happymoments.prayermemo.data;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Memo extends RealmObject {
    @PrimaryKey
    private int id;
    private String title;
    private String content;

    private int password;       // 4자리 제한

    private String alarmTime;   // HH:mm:ss
    private int alarmDay;       // 1:일 7:토 (Calendar.DAY_OF_WEEK 기준 따름)

    private String regDate;     // yyyy-MM-dd HH:mm:ss
    private String updDate;     // yyyy-MM-dd HH:mm:ss
    private int createId;
    private int validity;       // 1:기본 9:삭제

    public Memo() {
    }

    public Memo(int id, String title, String content, int password, String alarmTime, int alarmDay, String regDate, String updDate, int createId, int validity) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.password = password;
        this.alarmTime = alarmTime;
        this.alarmDay = alarmDay;
        this.regDate = regDate;
        this.updDate = updDate;
        this.createId = createId;
        this.validity = validity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    public int getAlarmDay() {
        return alarmDay;
    }

    public void setAlarmDay(int alarmDay) {
        this.alarmDay = alarmDay;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate;
    }

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "Memo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", password=" + password +
                ", alarmTime='" + alarmTime + '\'' +
                ", alarmDay=" + alarmDay +
                ", regDate='" + regDate + '\'' +
                ", updDate='" + updDate + '\'' +
                ", createId=" + createId +
                ", validity=" + validity +
                '}';
    }
}
