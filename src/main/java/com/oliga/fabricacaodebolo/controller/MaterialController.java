package com.oliga.fabricacaodebolo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oliga.fabricacaodebolo.model.Material;
import com.oliga.fabricacaodebolo.repository.MaterialRepository;


@RestController
@RequestMapping("/rawMaterials")
public class MaterialController {

	@Autowired
	private MaterialRepository repository; 
	
	
	@PostMapping()
	public ResponseEntity<Material> postPostagem(@RequestBody Material materiais){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(materiais));	
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Material>> getByName(@PathVariable String name){
		return ResponseEntity.ok(repository.findAllByNameContainingIgnoreCase(name));
	}
	

}
