package com.oliga.fabricacaodebolo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliga.fabricacaodebolo.model.Material;
import com.oliga.fabricacaodebolo.repository.MaterialRepository;


@RestController
@RequestMapping("/rawMaterials")
public class MaterialController {

	@Autowired
	private MaterialRepository repositoryMaterial; 
	
	
	@PostMapping()
	public ResponseEntity<Material> postPostagem(@RequestBody Material materiais){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryMaterial.save(materiais));
		
	}
	

}
