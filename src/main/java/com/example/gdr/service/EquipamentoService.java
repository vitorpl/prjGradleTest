package com.example.gdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gdr.model.Equipamento;
import com.example.gdr.repository.EquipamentoRepository;

@Service
public class EquipamentoService {
	
	private EquipamentoRepository repo;

	public EquipamentoService(EquipamentoRepository repo) {
		this.repo = repo;
	}
	
	public List<Equipamento> listar() {
		return repo.findAll();
	}
}
