package com.mattel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/{id}")
    public ResponseEntity<Brinquedos> buscarBrinquedoPorId(@PathVariable Long id) {
        Optional<Brinquedos> brinquedo = brinquedosRepository.findById(id);
        return brinquedo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
	@PostMapping
	public Brinquedos criarBrinquedo (@RequestBody Brinquedos brinquedo) {
		return brinquedosRepository.save(brinquedo);
	}

}
