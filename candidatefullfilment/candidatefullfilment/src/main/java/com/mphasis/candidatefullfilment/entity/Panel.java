package com.mphasis.candidatefullfilment.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//import java.sql.Time;

@Entity

@Table(name = "Panel")
public class Panel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int panelId;
    @Column(name = "panelName")
    private String panelName;
    @Column(name = "panelType")
    private String panelType;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "panelId")
    private List<Skills> skill = new ArrayList<>();
    @Column(unique = true)
    private String panelEmail;
    @Column(name = "slotsAvailability")
    private boolean slotsAvailability;
    @Column(name = "numberOfSlots")
    private int numberOfSlots;

  /*  @Column
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="India")
    private LocalDateTime scheduledTime;*/


   /* @Column(name = "duration")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime duration;*/

    @Column(name = "startTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime startTime;
    @Column(name = "endTime")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime endTime;

    public  String getPanelEmail() {
        return panelEmail;
    }

    public void setPanelEmail(String panelEmail) {
        this.panelEmail = panelEmail;
    }

    public int getPanelId() {
        return panelId;
    }

    public void setPanelId(int panelId) {
        this.panelId = panelId;
    }

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public List<Skills> getSkill() {
        return skill;
    }

    public void setSkill(List<Skills> skill) {
        this.skill = skill;
    }



    public boolean isSlotsAvailability() {
        return slotsAvailability;
    }

    public void setSlotsAvailability(boolean slotsAvailability) {
        this.slotsAvailability = slotsAvailability;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

 /*   public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }*/

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}