package com.telusko;


import jakarta.persistence.*;

@Entity
//@Table(name="aliegn_table")
public class Alien {

    @Id
    private int aid;
    //@Column(name="alien_name")
    private String aname;
    private String tech;

//    @Transient // donot add in db
//    private String tech;

    private String laptop;


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
