package com.cloud.TodoServices.model;



import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "todo")
public class TodoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "todoid", nullable = false)
    private Integer todoid;
    @Basic
    @Column(name = "userid", length = 25)
    private String userid;
    @Basic
    @Column(name = "title", length = 25)
    private String title;
    @Basic
    @Column(name = "description", length = 25)
    private String description;
    @Basic
    @Column(name = "isdone")
    private Boolean isdone;

    public Integer getTodoid() {
        return todoid;
    }

    public void setTodoid(int todoid) {
        this.todoid = todoid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsdone() {
        return isdone;
    }

    public void setIsdone(Boolean isdone) {
        this.isdone = isdone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoEntity that = (TodoEntity) o;
        return todoid == that.todoid && Objects.equals(userid, that.userid) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(isdone, that.isdone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(todoid, userid, title, description, isdone);
    }
}
