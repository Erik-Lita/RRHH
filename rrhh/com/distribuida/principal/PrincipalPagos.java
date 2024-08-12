package com.distribuida.principal;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.PagosDAO;
import com.distribuida.entities.Pagos;

public class PrincipalPagos {

    public static void main(String[] args) {
        //
        // Patrón de IoC (Inversión de Control)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); // Este es el contenedor
        PagosDAO pagosDAO = context.getBean("pagosDAOImpl", PagosDAO.class); // Este en minúscula, si no no funciona

        // CRUD: CREATE, READ, UPDATE y DELETE
        // EmpleadosDAO empleadosDAO = context.getBean("empleadosDAOImpl", EmpleadosDAO.class);

        // ADD
        Pagos pagos = new Pagos(0, 1, 2, "no", 25.50, 3.06, 1.00, 0.25, 27.31);
        // Insertar la nueva asistencia en la base de datos
        pagosDAO.add(pagos);

        // UPDATE (actualización) - 
        Pagos pagos2 = new Pagos(0, 1, 2, "no", 25.50, 3.06, 1.00, 0.25, 27.31);
        //pagos2.setEmpleados(empleadosDAO.findOne(3));
       // pagosDAO.up(pagos2);

        // Mostrar una asistencia específica
        //System.out.println("*****DEL**" + asistenciasDAO.findOne(86));

        // Mostrar todas los pagos
        pagosDAO.findAll().forEach(item -> {
            System.out.println(item.toString());
        });

        // Cerrar el contexto de Spring
        context.close();
    }
}