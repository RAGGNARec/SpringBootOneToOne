package com.Uisrael.TareaSemanaIII_OneToOne.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String puesto;
    @OneToOne
    @JoinColumn(name = "oficina_id",referencedColumnName = "id")
    private Oficina oficina;

}
