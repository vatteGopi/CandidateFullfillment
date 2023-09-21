package com.mphasis.candidatefullfilment.dto;

import com.mphasis.candidatefullfilment.entity.Skills;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class PanelDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int panelId;
    @NotNull(message = "Panel Name shouldn't be Null")
    private String panelName;
    @NotNull(message ="Either Internal nor External" )
    private String panelType;
    @NotNull
    private List<Skills> skill=new ArrayList<>();
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    @Column(unique = true)
    private String PanelEmail;
    @NotNull
    private boolean slotsAvailability;
    @NotNull
    private int numberOfSlots;
    @NotNull
    private LocalDateTime scheduledTime;
    @NotNull
    private LocalTime duration;
    @NotNull
    private LocalTime startTime;
    @NotNull
    private LocalTime endTime;


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

    public String getPanelEmail() {
        return PanelEmail;
    }

    public void setPanelEmail(String panelEmail) {
        this.PanelEmail = panelEmail;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }



    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

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

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
