package com.caresoft.clinicapp;

public class Usuario {
	// los atributos de Usuario 
	protected Integer id;
	protected int pin;
	
	//definiendo el constructor 
	public Usuario(Integer id) {
		this.id = id;
	}
		
	//definiendo los getters y setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	    
}
