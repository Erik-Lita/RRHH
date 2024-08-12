package com.distribuida.principal;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AsistenciaDAO;
import com.distribuida.entities.Asistencia;

public class PrincipalAsistencia {

    public static void main(String[] args) {
        //

        // Patrón de IoC (Inversión de Control)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); // Este es el contenedor
        AsistenciaDAO asistenciaDAO = context.getBean("asistenciaDAOImpl", AsistenciaDAO.class); // Este en minúscula, si no no funciona

        // CRUD: CREATE, READ, UPDATE y DELETE
        // EmpleadosDAO empleadosDAO = context.getBean("empleadosDAOImpl", EmpleadosDAO.class);

        // ADD
       Asistencia asistencia = new Asistencia(0,1,Date.valueOf(LocalDate.now()),2024,8,12,LocalTime.parse("20:20:10"),LocalTime.parse("21:00:00"),160,20,"SI",1,"NO","NO",179);
        // Insertar la nueva asistencia en la base de datos
        asistenciaDAO.add(asistencia);

        // UPDATE (actualización) - 
        Asistencia asistencia2 = new Asistencia(0,1,Date.valueOf(LocalDate.now()),2024,8,12,LocalTime.parse("20:20:10"),LocalTime.parse("21:00:00"),160,20,"SI",1,"NO","NO",179);
        //asistencia2.setEmpleados(empleadosDAO.findOne(3));
       // asistenciaDAO.up(asistencia2);

        // Mostrar una asistencia específica
        //System.out.println("*****DEL**" + asistenciasDAO.findOne(86));

        // Mostrar todas las asistencias
        asistenciaDAO.findAll().forEach(item -> {
            System.out.println(item.toString());
        });

        // Cerrar el contexto de Spring
        context.close();
    }
}