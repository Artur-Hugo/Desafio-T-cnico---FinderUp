package com.oliga.fabricacaodebolo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oliga.fabricacaodebolo.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

	List<Material> findAllByNameContainingIgnoreCase(String string);

}
