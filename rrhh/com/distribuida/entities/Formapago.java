package com.distribuida.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Forma_pago")
public class Formapago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pago") 
    private int id_forma_pago; 
    @Column(name = "forma_pago") 
    private String forma_pago; 
    @Column(name = "descipcion") 
    private String descipcion; 
    
    public Formapago() {}

	public Formapago(int id_forma_pago, String forma_pago, String descipcion) {
		super();
		this.id_forma_pago = id_forma_pago;
		this.forma_pago = forma_pago;
		this.descipcion = descipcion;
	}

	public int getId_forma_pago() {
		return id_forma_pago;
	}

	public void setId_forma_pago(int id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public String getDescipcion() {
		return descipcion;
	}

	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}

	@Override
	public String toString() {
		return "Formapago [id_forma_pago=" + id_forma_pago + ", forma_pago=" + forma_pago + ", descipcion=" + descipcion
				+ "]";
	}


    
}
