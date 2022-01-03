package com.oliga.fabricacaodebolo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

@Entity
public class Material implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "O atributo name eh obrigatorio")
	private String name;
	
	@NotNull(message = "O atributo quantity eh obrigatorio")
	private int quantity;
	
	@NotNull(message = "O atributo user eh obrigatorio")
	private String user;
	
	public Material() {}
	
	public Material(Integer id, @NotNull(message = "O atributo name eh obrigatorio") String name,
			@NotNull(message = "O atributo quantity eh obrigatorio") int quantity,
			@NotNull(message = "O atributo user eh obrigatorio") String user) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.user = user;
	}

	//Getters e setters
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}


	
	
}
