package com.caresoft.clinicapp;

public interface UsuarioCompatibleConHIPAA {
	//implementando los metodos abstractos 
	abstract boolean assignPin(int pin);
	abstract boolean accessAuthorized(Integer confirmedAuthID);
	

}
