package com.happymoments.prayermemo.data;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Memo extends RealmObject {
    @PrimaryKey
    private int id;             // id
    private int folderId;       // folder id

    private String title;       // 제목
    private String content;     // 내용

    private boolean isFavorite; // 중요 메모 여부
    private boolean isPrivate;  // 비공개 여부
    private int password;       // 4자리 제한

    private boolean isAlarm;    // 알람 설정 여부
    private String alarmTime;   // HH:mm:ss
    private int alarmDay;       // 1:일 ~ 7:토 (Calendar.DAY_OF_WEEK 기준 따름)

    private int createId;       // 생성자 id
    private String regDate;     // yyyy-MM-dd HH:mm:ss
    private String updDate;     // yyyy-MM-dd HH:mm:ss
    private int validity;       // 1:기본 2:업데이트 9:삭제

    public Memo() {
    }

    public Memo(int id, int folderId, String title, String content, boolean isFavorite, boolean isPrivate, int password, boolean isAlarm, String alarmTime, int alarmDay, int createId, String regDate, String updDate, int validity) {
        this.id = id;
        this.folderId = folderId;
        this.title = title;
        this.content = content;
        this.isFavorite = isFavorite;
        this.isPrivate = isPrivate;
        this.password = password;
        this.isAlarm = isAlarm;
        this.alarmTime = alarmTime;
        this.alarmDay = alarmDay;
        this.createId = createId;
        this.regDate = regDate;
        this.updDate = updDate;
        this.validity = validity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
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

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean alarm) {
        isAlarm = alarm;
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

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
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
                ", folderId=" + folderId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", isFavorite=" + isFavorite +
                ", isPrivate=" + isPrivate +
                ", password=" + password +
                ", isAlarm=" + isAlarm +
                ", alarmTime='" + alarmTime + '\'' +
                ", alarmDay=" + alarmDay +
                ", createId=" + createId +
                ", regDate='" + regDate + '\'' +
                ", updDate='" + updDate + '\'' +
                ", validity=" + validity +
                '}';
    }
}
