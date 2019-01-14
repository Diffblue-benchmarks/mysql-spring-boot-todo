package com.example.fabrikam.TodoDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private boolean complete;

    public TodoItem() {
        this.name = name;
        this.id = id;
    }

    public TodoItem(long id) {
        this.id = id;
    }

    public TodoItem(String name) {
        this.name = name;
    }

    public TodoItem(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public TodoItem(String name, long id, boolean complete) {
        this.name = name;
        this.id = id;
        this.complete = complete;
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

    public void setId(long id) {
        this.id = id;
    }

    public boolean isComplete() {
        return complete;
    }
    
    public void setComplete(boolean complete) {
        this.complete = complete;
        return;
    }


}