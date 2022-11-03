package edu.eci.pdsw.samples;

import edu.eci.pdsw.samples.entities.Paciente;
import edu.eci.pdsw.samples.entities.TipoIdentificacion;
import edu.eci.pdsw.samples.persistence.PersistenceException;
import edu.eci.pdsw.samples.services.ExcepcionServiciosSuscripciones;
import edu.eci.pdsw.samples.services.ServiciosPaciente;
import edu.eci.pdsw.samples.services.ServiciosPacientesFactory;

import java.sql.Date;

public class main {
    public static void main(String[] args) throws ExcepcionServiciosSuscripciones, PersistenceException {
        ServiciosPaciente serviciosPaciente = ServiciosPacientesFactory.getInstance().getServiciosPaciente();

        System.out.println("Buscar Pacientes");
        System.out.println(serviciosPaciente.consultarPacientes());
        System.out.println("Buscar Paciente Por ID");
        System.out.println(serviciosPaciente.consultarPacientesPorId(59511,TipoIdentificacion.TI));
        System.out.println("Buscar consultas");
        System.out.println(serviciosPaciente.consultarConsultas());
        System.out.println("Buscar Menores de edad con enfermedades");
        System.out.println(serviciosPaciente.consultarMenoresConEnfermedadContagiosa());
    }
}

