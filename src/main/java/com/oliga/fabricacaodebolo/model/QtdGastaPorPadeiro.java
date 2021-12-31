package com.oliga.fabricacaodebolo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class QtdGastaPorPadeiro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private int quantity;

	private String user;
	
	@CreationTimestamp
	@Column( nullable = false, updatable = false)
	@JsonFormat(pattern="yyyy-MM-dd  HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate = new java.sql.Date(System.currentTimeMillis());
	
	public QtdGastaPorPadeiro() {}

	public QtdGastaPorPadeiro(Integer id, String name, int quantity, String user) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.user = user;
	}

	
	
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	
}
