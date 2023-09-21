package com.mphasis.candidatefullfilment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int skilllId;
    @Column(name = "panelSkill")
    private String skill;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Panel> panels;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public List<Panel> getPanels() {
        return panels;
    }

    public void setPanels(List<Panel> panels) {
        this.panels = panels;
    }
    public int getSkilllId() {
        return skilllId;
    }

    public void setSkilllId(int skilllId) {
        this.skilllId = skilllId;
    }

    public String getSkills() {
        return skill;
    }

    public void setSkills(String skills) {
        this.skill = skills;
    }
}
