package com.oliga.fabricacaodebolo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.oliga.fabricacaodebolo.model.Material;
import com.oliga.fabricacaodebolo.model.QtdGastaPorPadeiro;
import com.oliga.fabricacaodebolo.repository.MaterialRepository;
import com.oliga.fabricacaodebolo.repository.QtdGastaPadRepository;

import org.springframework.web.server.ResponseStatusException;

@Service
public class MaterialService {
	
	@Autowired
	MaterialRepository repository;
	
	@Autowired
	QtdGastaPadRepository qtdrepository;
	

	///Metodo da requisição put. baixa do material no sistema quando for utilizar na receita
	public Material darBaixa(Integer id, Material obj) {
		
		Material material = buscarMaterialPeloId(id);

		if((material.getQuantity() - obj.getQuantity()) < 0 ) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não é possível dar baixa", null);

		}else {
		
		material.setName(material.getName());
		material.setQuantity(material.getQuantity() - obj.getQuantity());
		material.setUser(material.getUser());

		QtdGastaPorPadeiro qtdGasta = new QtdGastaPorPadeiro(null, material.getName() , obj.getQuantity(), obj.getUser());
		qtdrepository.save(qtdGasta);
		
		return repository.save(material);
		}
	}
	
	
	
	
	
	
	private Material buscarMaterialPeloId(Integer id) {

		Material materialSalvo = repository.findById(id).orElse(null);

		if (materialSalvo == null) {

			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Postagem não encontrada!", null);
		}

		return materialSalvo;
	}

}
