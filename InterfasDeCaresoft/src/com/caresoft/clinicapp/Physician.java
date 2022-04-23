package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;
public class Physician extends Usuario implements UsuarioCompatibleConHIPAA  {
	
	//definiendo los atributos 
    private ArrayList<String> patientNotes;
    
	//definiendo el constructor 
    public Physician(Integer id) {
		super(id);
		this.patientNotes = new ArrayList<String>();
	}
    
    public boolean assignPin(int pin) {
    	//convirtiendo a string el pin
    	String letra = Integer.toString(pin);
    	//implementando la condicion 	
    	if ( letra.length()==4 ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
    //implementando el metodo accesAuthorized
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if ( id==confirmedAuthID) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }

    //definiendo los getters y setters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	    
}
