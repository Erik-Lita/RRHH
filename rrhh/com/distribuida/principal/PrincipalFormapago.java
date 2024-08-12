package com.distribuida.principal;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FormapagoDAO;
import com.distribuida.entities.Formapago;

public class PrincipalFormapago {

    public static void main(String[] args) {
        //
        // Patrón de IoC (Inversión de Control)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); // Este es el contenedor
        FormapagoDAO formapagoDAO = context.getBean("formapagoDAOImpl", FormapagoDAO.class); // Este en minúscula, si no no funciona

        // CRUD: CREATE, READ, UPDATE y DELETE
        // EmpleadosDAO empleadosDAO = context.getBean("empleadosDAOImpl", EmpleadosDAO.class);

        // ADD
        Formapago formapago = new Formapago(0,"transferencia","abona 50 dolares :v");
        // Insertar la nueva asistencia en la base de datos
        formapagoDAO.add(formapago);

        // UPDATE (actualización) - 
        Formapago formapago2 = new Formapago();
        //formapago2.setEmpleados(empleadosDAO.findOne(3));
       // formapago2DAO.up(formapago2);

        // Mostrar una asistencia específica
        //System.out.println("*****DEL**" + asistenciasDAO.findOne(86));

        // Mostrar todas los pagos
        formapagoDAO.findAll().forEach(item -> {
            System.out.println(item.toString());
        });

        // Cerrar el contexto de Spring
        context.close();
    }
}