package com.sistemas.turnos.repository;

import com.sistemas.turnos.model.PlanTope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanTopeRepository extends JpaRepository<PlanTope, Long> {

}
