package com.example.hibernate_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Custumer {

    @Id
    @GeneratedValue
    private int id;
    
    private String name;
    private long number;
    private String city;

    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setnumber(long number){
        this.number = number;
    }
    public long getnumber(){
        return number;
    }

    public void setcity(String city){
        this.city = city;
    }
    public String getcity(){
        return city;
    }
}
