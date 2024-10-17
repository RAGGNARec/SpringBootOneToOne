package com.Uisrael.TareaSemanaIII_OneToOne.repositories;

import com.Uisrael.TareaSemanaIII_OneToOne.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
