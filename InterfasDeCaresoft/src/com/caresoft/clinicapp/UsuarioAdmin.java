package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;
public class UsuarioAdmin extends Usuario implements AdminCompatibleConHIPAA,UsuarioCompatibleConHIPAA {
	
	//definiendo los atributos de la clase
    private Integer employeeID;
    private String role;
    private  ArrayList<String> securityIncidents;
    
    //definiendo el constructor 
    public UsuarioAdmin(Integer id, String role) {
    	super(id);
    	this.role = role;
    	this.securityIncidents= new ArrayList<String>();
    }
    
    //implementando el metodo assignPin
    public boolean assignPin(int pin) {
    	String clave  = Integer.toString(pin);
    	if ( clave.length()>=6) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    //implementando el metodo accesAuthorized
    public boolean accessAuthorized( Integer confirmedAuthID) {
    	if ( id == confirmedAuthID) {
    		return true;
    	}
    	else {
    		authIncident();
    		return false;
    	}
    }
    public ArrayList<String> reportSecurityIncidents(){
    	return securityIncidents;
    }
    
    // PARA HACER: ¡Implementar UsuarioCompatibleConHIPAA!
    // PARA HACER: ¡Implementar AdminCompatibleConHIPAA
    
    public void newIncident(String notes) {
        String report = String.format(
            "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
	public void authIncident() {
        String report = String.format(
            "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n", 
            new Date(), this.id, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents.add(report);
    }

    // implementando los getters y setters 
	public Integer getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

}
