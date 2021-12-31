package com.oliga.fabricacaodebolo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.oliga.fabricacaodebolo.model.QtdGastaPorPadeiro;

@Repository
public interface QtdGastaPorPadRepository extends JpaRepository<QtdGastaPorPadeiro, Integer> {


}
