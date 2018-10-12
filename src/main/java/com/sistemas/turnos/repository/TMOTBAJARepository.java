package com.sistemas.turnos.repository;

import com.sistemas.turnos.model.TMOTBAJA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TMOTBAJARepository extends JpaRepository<TMOTBAJA, Long> {

}
