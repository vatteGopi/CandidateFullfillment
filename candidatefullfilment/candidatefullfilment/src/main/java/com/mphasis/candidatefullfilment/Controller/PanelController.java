package com.mphasis.candidatefullfilment.Controller;

import com.mphasis.candidatefullfilment.Service.PanelService;
import com.mphasis.candidatefullfilment.dto.PanelDTO;
import com.mphasis.candidatefullfilment.entity.Panel;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PanelController {
    @Autowired
    PanelService panelService;


    @GetMapping("/findall")
    public ResponseEntity<Iterable<Panel>> findAll(){
        try {
            return new ResponseEntity<Iterable<Panel>>(panelService.findAll(),HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<Iterable<Panel>>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/addpanel")
    public Panel addpanel(@Valid @RequestBody PanelDTO panelDTO){
        return panelService.addPanel(panelDTO);
    }


    @GetMapping(path="/panels")
    public List<Panel> findAllPanel(Panel panel){
        return panelService.getPanels();
    }


    @GetMapping("/panel/{panelEmail}")
    public Panel findPanelByEmail(@PathVariable("panelEmail") String panelEmail) {
        return panelService.getPanelByEmail(panelEmail);
    }
    @GetMapping("panels/{panelId}")
    public Panel findByPanelId(@PathVariable("panelId") int panelId){
        return panelService.getPanelById(panelId);
    }

    @PutMapping("/update")
    public Panel updatePanel(@RequestBody Panel panel){
        return panelService.updatePanel(panel);
    }
    @DeleteMapping("/delete/{panelemail}")
    public String deletePanel(@PathVariable("panelEmail") String panelEmail){
        return panelService.deletePanel(panelEmail);
    }


}


  /*  @PostMapping("/createPanel")
    public Panel savePanel(@Valid @RequestBody PanelDTO panelDTO){
        return panelService.createPanel(panelDTO);
    }
    @PostMapping("/createPanels")
    public List<Panel> savePanels(@RequestBody List<Panel> panels){
        return panelService.createPanels(panels);

    }
    @GetMapping("/panel/{id}")
    public ResponseEntity<Panel>  findbyId(@PathVariable int id){
        Panel panel= panelService.findbyId(id);
        if (panel==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(panel));
    }
    @GetMapping("/panel/{panelEmail}")
    public ResponseEntity<Panel> findByPanelEmail(@PathVariable("panelEmail") String panelEmail){
        Panel panel=panelService.findPanelEmail(panelEmail);
        return ResponseEntity.ok(panelService.getPanelByEmail(panelEmail));
    }



    @GetMapping("/panels")
    public List<Panel> findAllPanels(Panel panel){
        return panelService.getPanels();
    }
    @PutMapping("/updatePanel")
    public Panel updatepanel( @Valid @RequestBody PanelDTO panelDTO){
        return panelService.updatePanel(panelDTO);
    }
    @DeleteMapping("/deletePanel/{panelId}")
    public String deletePanel(@PathVariable int panelId){
        return panelService.deletePanel(panelId);
    }
}
*/

//    @PostMapping("/AddPanel")
//    public PanelRegistration addPanel(@RequestBody PanelRegistration panelRegistration){
//        return panelService.savePanel(panelRegistration);
//    }
//    @PostMapping("/AddPanels")
//    public List<PanelRegistration> addPanels(@RequestBody List<PanelRegistration> panelRegistrations){
//        return panelService.savePanel(panelRegistrations);
//    }

//    @GetMapping("/panel/{skills}")
//    public List<PanelRegistration> findbySkills(@PathVariable("skills") String skills){
//        return panelService.findbySkills(skills);
//    }