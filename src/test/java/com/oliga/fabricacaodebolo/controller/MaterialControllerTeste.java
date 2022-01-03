package com.oliga.fabricacaodebolo.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import com.oliga.fabricacaodebolo.model.Material;
import com.oliga.fabricacaodebolo.model.QtdGastaPorPadeiro;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MaterialControllerTeste {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Material material;
	
	private QtdGastaPorPadeiro QtdGasta;
	
	@BeforeAll
	public void start() throws ParseException {
		material = new Material(null, "Leite", 10, "Ciclano");
		QtdGasta = new QtdGastaPorPadeiro(null,  5, "Josephina");
	}
	
	
	@Test
	@Order(1)
    @DisplayName("✔ Cadastrar Material!")
	public void deveRealizarPostMaterial() {
		
		HttpEntity<Material> request = new HttpEntity<Material>(material);
		ResponseEntity<Material> resposta = testRestTemplate.exchange("/rawMaterials", HttpMethod.POST, request, Material.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	
	}
	
	@Test
	@Order(2)
    @DisplayName("👍 Listar Materiais com nome Leite!")
	public void deveMostrarMateriaisComNomeLeite() {
		
		
		ResponseEntity<String> resposta = testRestTemplate.exchange("/rawMaterials/leite", HttpMethod.GET, null, String.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	
	@Test
    @Order(3)
	@DisplayName("😳 PutQtdGasta!")
	public void deveRealizarPutQtdGasta() {
		
		

		HttpEntity<QtdGastaPorPadeiro> request = new HttpEntity<QtdGastaPorPadeiro>(QtdGasta);

		ResponseEntity<QtdGastaPorPadeiro> resposta = testRestTemplate.exchange("/rawMaterials/1/request", HttpMethod.PUT, request, QtdGastaPorPadeiro.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		
	}
	
	@Test
	@Order(4)
    @DisplayName("👍 Listar os Padeiros com o nome Josephina!")
	public void deveMostrarQtdGastaPeloPadeiroJosephina() {
		
		ResponseEntity<String> resposta = testRestTemplate.exchange("/rawMaterials/user/Josephina", HttpMethod.GET, null, String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	
}
