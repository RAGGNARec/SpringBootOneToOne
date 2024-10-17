package com.Uisrael.TareaSemanaIII_OneToOne.repositories;

import com.Uisrael.TareaSemanaIII_OneToOne.entities.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Long> {

}
