package com.example.gdr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gdr.model.Equipamento;
import com.example.gdr.service.EquipamentoService;

@RestController
@RequestMapping("/api/V1/equipamento")
public class EquipamentoController {

	@Autowired
	EquipamentoService service;
	
	@GetMapping
	public List<Equipamento> listar() {
		return service.listar();
	}
	
}
