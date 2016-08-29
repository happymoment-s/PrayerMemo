package com.happymoments.prayermemo.data;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Folder extends RealmObject{

    @PrimaryKey
    private int id;             // id
    private String name;        // 폴더명
    private int orderIndex;     // sorting 순서
    private String color;       // 색상

    private int createId;       // 생성자 id
    private String regDate;     // yyyy-MM-dd HH:mm:ss
    private String updDate;     // yyyy-MM-dd HH:mm:ss
    private int validity;       // 1:기본 2:업데이트 9:삭제

    public Folder() {
    }

    public Folder(int id, String name, int orderIndex, String color, int createId, String regDate, String updDate, int validity) {
        this.id = id;
        this.name = name;
        this.orderIndex = orderIndex;
        this.color = color;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Folder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderIndex=" + orderIndex +
                ", color='" + color + '\'' +
                ", createId=" + createId +
                ", regDate='" + regDate + '\'' +
                ", updDate='" + updDate + '\'' +
                ", validity=" + validity +
                '}';
    }
}
