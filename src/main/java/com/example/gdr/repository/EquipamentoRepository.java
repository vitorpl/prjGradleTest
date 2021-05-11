package com.example.gdr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gdr.model.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
	
}
