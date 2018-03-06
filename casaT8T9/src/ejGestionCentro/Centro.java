package ejGestionCentro;

import java.util.ArrayList;

public class Centro {

	ArrayList<Persona> arCentro;
	
	public ArrayList<Persona> getArCentro() {
		return arCentro;
	}

	public void setArCentro(ArrayList<Persona> arCentro) {
		this.arCentro = arCentro;
	}

	public Centro() {
		arCentro= new ArrayList<Persona>();
	}
	public Centro (Centro c) {
		this(c.getArCentro());
		
	}
	public Centro(ArrayList<Persona> arCentro) {
		this.arCentro= new ArrayList<Persona>();
		this.arCentro.addAll(arCentro);
	}
	
	public void darAlta(Persona p) throws Error {
		boolean encontrado=false;
		for(int i=0;i<arCentro.size() && encontrado==false;i++){
			if (arCentro.get(i).getDni().equals(p.getDni())){
				encontrado=true;
			}
		}
		if(encontrado==true){
			throw new Error(1);
		}else{
			arCentro.add(p);
		}
		
	}
	
	public void darBaja(String dni) throws Error {
		boolean semaforo=false;
		int posicion=-1;
		for (int i=0;i<arCentro.size() && semaforo==false;i++) {
			if(dni.equals(arCentro.get(i).getDni())) {
				posicion=i;
				semaforo=true;
				
			}
		}
		if(posicion!=-1) {
			arCentro.remove(posicion);
		}
		else{
			throw new Error(2);
		}
		
		
	}
	public Persona buscarPersona(String dni) throws Error{
		boolean semaforo=false;
		int posicion=-1;
		for (int i=0;i<arCentro.size() && semaforo==false;i++) {
			if(dni.equals(arCentro.get(i).getDni())) {
				posicion=i;
				semaforo=true;
				
			}
		}
		if(posicion==-1) {
			throw new Error(2);
		}
		else {
			return arCentro.get(posicion);

		}
		
		
	}
	
	public void imprimirEmpleados() {
		for(Persona p : arCentro) {
			if (p instanceof Profesores) {
				System.out.println("Profesor-- Nombre: "+((Empleado)p).getNombre()+"\tApellidos: "+((Empleado)p).getApellido()+"\tSalario: "+((Empleado)p).getSalario());
				
			}else if(p instanceof PersonalServicio){
				System.out.println("Personal de Servicio-- Nombre: "+((PersonalServicio)p).getNombre()+"\tApellidos: "+((PersonalServicio)p).getApellido()+"\tSalario: "+((PersonalServicio)p).getSalario());
				
			}
			
		}
	}
	
	public void imprimirIntegrantesCentro() {
		for(Persona p : arCentro) {
			if (p instanceof Estudiantes) {
				System.out.println(((Estudiantes)p).toString());
			}else if(p instanceof Profesores){
				System.out.println(((Profesores)p).toString());
				
			}else if(p instanceof PersonalServicio){
				System.out.println(((PersonalServicio)p).toString());
				
			}
		}
	}

}
