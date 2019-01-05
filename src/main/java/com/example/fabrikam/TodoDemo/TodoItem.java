package com.example.fabrikam.TodoDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean complete;
    private Date date;

    public TodoItem() {
        this.name = name;
        this.id = id;
        this.complete = false;
        this.date = date;
    }

    public TodoItem(String name) {
        this.name = name;
        this.complete = false;
    }

    @Override
    public String toString() {
        return "[ name=" + this.name + ", complete=" + this.complete + " ]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        return;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
        return;
    }

    public boolean isComplete() {
        return complete;
    }
    
    public void setComplete(boolean complete) {
        this.complete = complete;
        return;
    }


}