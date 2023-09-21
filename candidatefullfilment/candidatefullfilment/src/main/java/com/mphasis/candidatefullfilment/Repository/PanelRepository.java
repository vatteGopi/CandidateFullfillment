package com.mphasis.candidatefullfilment.Repository;

import com.mphasis.candidatefullfilment.entity.Panel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PanelRepository extends JpaRepository<Panel , Integer> {
    Panel findByPanelEmail(String panelEmail);


}
