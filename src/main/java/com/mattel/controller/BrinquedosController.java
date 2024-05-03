package com.mattel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mattel.model.Brinquedos;
import com.mattel.repository.BrinquedosRepository;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedosController {
	
	@Autowired
	private BrinquedosRepository brinquedosRepository;
	
	@GetMapping
	public List<Brinquedos> listarBrinquedos() {
		return brinquedosRepository.findAll();
	}
	@PostMapping
	public Brinquedos criarBrinquedo (@RequestBody Brinquedos brinquedo) {
		return brinquedosRepository.save(brinquedo);
	}

}
