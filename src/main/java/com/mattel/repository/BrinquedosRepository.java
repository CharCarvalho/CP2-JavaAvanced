package com.mattel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mattel.model.Brinquedos;

@Repository
public interface BrinquedosRepository extends JpaRepository<Brinquedos, Long>{

}
