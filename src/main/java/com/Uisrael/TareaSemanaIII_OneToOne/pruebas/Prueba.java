package com.Uisrael.TareaSemanaIII_OneToOne.pruebas;

import com.Uisrael.TareaSemanaIII_OneToOne.entities.Empleado;
import com.Uisrael.TareaSemanaIII_OneToOne.entities.Oficina;
import com.Uisrael.TareaSemanaIII_OneToOne.repositories.EmpleadoRepository;
import com.Uisrael.TareaSemanaIII_OneToOne.repositories.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Prueba implements CommandLineRunner {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private OficinaRepository oficinaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Crear y guardar explícitamente una nueva oficina
        Oficina oficina = new Oficina();
        oficina.setNumeroOficina("A101");
        oficina.setPiso("3");
        oficina.setEdificio("Edificio Principal");
        oficinaRepository.save(oficina);  // Guardar la oficina primero

        // Crear y guardar explícitamente un nuevo empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Javier Alejandro");
        empleado.setPuesto("Programador");
        empleado.setOficina(oficina);  // Asignar la oficina ya guardada al empleado
        empleadoRepository.save(empleado);  // Guardar el empleado

        // Actualización de datos del empleado
        empleado.setNombre("Javier Actualizado");
        empleadoRepository.save(empleado);  // Guardar los cambios del empleado

        // Verificación: Imprimir todos los empleados
        Iterable<Empleado> empleados = empleadoRepository.findAll();
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() + ", Puesto: " + e.getPuesto() +
                    ", Oficina: " + e.getOficina().getNumeroOficina() +
                    ", Piso: " + e.getOficina().getPiso() +
                    ", Edificio: " + e.getOficina().getEdificio());
        }

    }
}
