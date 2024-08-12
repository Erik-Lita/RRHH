package com.distribuida.entities;

import java.sql.Date;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "asistencia")
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia") 
    private int id_asistencia; 
    @Column(name = "id_empleado")
    private int id_empleado;
    @Column(name = "fecha_asistencia")
    private Date fecha_asistencia;
    @Column(name = "anio")
    private int anio;
    @Column(name = "mes")
    private int mes;
    @Column(name = "dia")
    private int dia;
    @Column(name = "hora_entrada_trabajo")
    private LocalTime hora_entrada_trabajo;
    @Column(name = "hora_salida_trabajo")
    private LocalTime hora_salida_trabajo;
    @Column(name = "total_horas_trabajo")
    private int total_horas_trabajo;
    @Column(name = "total_horas_extra")
    private int total_horas_extra;
    @Column(name = "registro_atraso")
    private String registro_atraso;
    @Column(name = "total_horas_atraso")
    private int total_horas_atraso;
    @Column(name = "registro_falta")
    private String registro_falta;
    @Column(name = "registro_vacacion")
    private String registro_vacacion;
    @Column(name = "total_horas_trabajo_mes")
    private int total_horas_trabajo_mes;

    // Constructor por defecto
    public Asistencia() {}

    // Constructor con parámetros
    public Asistencia(int id_asistencia, int id_empleado, Date fecha_asistencia, int anio, int mes, int dia,
                      LocalTime hora_entrada_trabajo, LocalTime hora_salida_trabajo, int total_horas_trabajo,
                      int total_horas_extra, String registro_atraso, int total_horas_atraso, String registro_falta,
                      String registro_vacacion, int total_horas_trabajo_mes) {

        this.id_asistencia = id_asistencia; // Cambiado de "id_asistencias" a "id_asistencia"
        this.id_empleado = id_empleado;
        this.fecha_asistencia = fecha_asistencia;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora_entrada_trabajo = hora_entrada_trabajo;
        this.hora_salida_trabajo = hora_salida_trabajo;
        this.total_horas_trabajo = total_horas_trabajo;
        this.total_horas_extra = total_horas_extra;
        this.registro_atraso = registro_atraso;
        this.total_horas_atraso = total_horas_atraso;
        this.registro_falta = registro_falta;
        this.registro_vacacion = registro_vacacion;
        this.total_horas_trabajo_mes = total_horas_trabajo_mes;
    }

    // Getters y setters
    public int getId_asistencia() { // Cambiado de "getId_asistencias" a "getId_asistencia"
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) { // Cambiado de "setId_asistencias" a "setId_asistencia"
        this.id_asistencia = id_asistencia;
    }

    // (Resto de los getters y setters permanece igual)
}
