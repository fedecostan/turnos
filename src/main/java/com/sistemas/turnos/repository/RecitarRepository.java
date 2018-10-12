package com.sistemas.turnos.repository;

import com.sistemas.turnos.model.Recitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecitarRepository extends JpaRepository<Recitar, Long> {

}
