package com.mphasis.candidatefullfilment.Service;


import com.mphasis.candidatefullfilment.Repository.PanelRepository;
import com.mphasis.candidatefullfilment.dto.PanelDTO;
import com.mphasis.candidatefullfilment.entity.Panel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanelService {
    @Autowired
    PanelRepository panelRepository;
    @Autowired
    ModelMapper modelMapper;
    public Panel addPanel(PanelDTO panelDTO) {
        Panel panelRegistration = modelMapper.map(panelDTO, Panel.class);
        return panelRepository.save(panelRegistration);
    }

    public Panel savePanel(Panel panelRegistration){
        return panelRepository.save(panelRegistration);
    }
    public java.util.List<Panel> savePanel(List<Panel> panelRegistrations){
        return panelRepository.saveAll(panelRegistrations);
    }

    public List<Panel> getPanels() {
        return panelRepository.findAll();

    }

  public Panel getPanelById(int panelId) {

      return panelRepository.findById(panelId).orElse(null);
  }

    public Panel getPanelByEmail(String panelEmail) {
        return panelRepository.findByPanelEmail(panelEmail);
    }


    public Panel updatePanel(Panel panel) {
        Panel existingPanelRegistration = panelRepository.findByPanelEmail(panel.getPanelEmail());
        existingPanelRegistration.setSkill(panel.getSkill());
        existingPanelRegistration.setStartTime(panel.getStartTime());
        existingPanelRegistration.setEndTime(panel.getEndTime());
        existingPanelRegistration.setNumberOfSlots(panel.getNumberOfSlots());
       // existingPanelRegistration.setScheduleTimeSlots(panel.getScheduleTimeSlots());
        return panelRepository.save(existingPanelRegistration);
    }


    public String deletePanel(String panelEmail) {
        panelRepository.deleteById(Integer.valueOf(panelEmail));
        return "panel removed "+panelEmail;

    }

    public Iterable<Panel> findAll() {
        return panelRepository.findAll();
    }


//    public List<PanelRegistration> findbySkills(String skills) {
//        return panelRipository.findBySkills(skills);
//    }
}






 /*   public Panel createPanel(PanelDTO panelDTO){
      Panel panels= this.modelMapper.map(panelDTO,Panel.class);
      return panelRepository.save(panels);
    }
    public List<Panel> createPanels(List<Panel> panels) {

        return panelRepository.saveAll(panels);
    }

    public Panel getPanelById(int panelId) {

        return panelRepository.findById(panelId).orElse(null);
    }
    public Panel getPanelByEmail(String panelemail){
        return panelRepository.findPanelEmail(panelemail);
    }

    public List<Panel> getPanels() {

        return panelRepository.findAll();
    }


    public Panel findbyId(int id) {

        return panelRepository.findById(id).orElse(null);
    }
    public Panel findPanelEmail(String panelEmail){
        return panelRepository.findPanelEmail(panelEmail);
    }

    public Panel updatePanel(PanelDTO panelDTO) {
       Panel panel= this.modelMapper.map(panelDTO,Panel.class);
        Panel existingPanel = panelRepository.findPanelEmail(Panel.getpanelEmail());
        existingPanel.setPanelName(panel.getPanelName());
        existingPanel.setScheduledTime(panel.getScheduledTime());
        existingPanel.setNumberOfSlots(panel.getNumberOfSlots());
        existingPanel.setStartTime(panel.getStartTime());
        existingPanel.setEndTime(panel.getEndTime());
         panelRepository.save(existingPanel);
         return existingPanel;
    }


    public String deletePanel(int panelId) {
        panelRepository.deleteById(panelId);
        return "panel removed " + panelId;
    }


}*/
 /*  public Panel getPanelById(int Id) {
        return panelRepository.findById(Id);
       *//* return panelRepository.findById(panelId);*//*
    }*/