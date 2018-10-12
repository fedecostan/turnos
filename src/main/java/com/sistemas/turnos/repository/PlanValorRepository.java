package com.sistemas.turnos.repository;

import com.sistemas.turnos.model.PlanValor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanValorRepository extends JpaRepository<PlanValor, Long> {

}
