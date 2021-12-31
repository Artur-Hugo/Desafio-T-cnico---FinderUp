package com.oliga.fabricacaodebolo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.oliga.fabricacaodebolo.model.QtdGastaPorPadeiro;

@Repository
public interface QtdGastaPadRepository extends JpaRepository<QtdGastaPorPadeiro, Integer> {

	List<QtdGastaPorPadeiro> findAllByUserContainingIgnoreCase(String user);


}
