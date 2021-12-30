package com.oliga.fabricacaodebolo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.oliga.fabricacaodebolo.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
