package tema9.garaje.tratamientoEx;

import java.util.ArrayList;

public class Coche {
	private String matricula;
	private String direccionDue;
	private ArrayList<Reparacion> arReparacion;
	
	
	
	public ArrayList<Reparacion> getArReparacion() {
		return arReparacion;
	}
	public void setArReparacion(ArrayList<Reparacion> arReparacion) {
		this.arReparacion = arReparacion;
	}
	public Coche(String matricula, String direccionDue){
		this.matricula=matricula;
		this.direccionDue=direccionDue;
		arReparacion= new ArrayList<Reparacion>(0);
	}
	public Coche() {
		this.matricula="";
		this.direccionDue="";
		arReparacion= new ArrayList<Reparacion>(0);
		
	}
	public ArrayList<Reparacion> buscaReparaciones(String palabraClave){
		ArrayList<Reparacion> arBuscados= new ArrayList<Reparacion>(0);
		for(Reparacion r: arReparacion){
			if(r.getDescripcion().toLowerCase().contains(palabraClave.toLowerCase())){
				arBuscados.add(r);
			}
			
		}
		return arBuscados;
		
	}
	
	public void agregaReparacion(Reparacion r) throws arrayVacia, kmErroneo{
		if(arReparacion.isEmpty()) {
			arReparacion.add(r);
		}else {

			if(ultimaReparacion().getKms()>r.getKms()){
				
				throw new kmErroneo(ultimaReparacion().getKms(), r.getKms());
			}else {
				arReparacion.add(r);
			}
		}
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDireccionDue() {
		return direccionDue;
	}
	public void setDireccionDue(String direccionDue) {
		this.direccionDue = direccionDue;
	}
	
	public Reparacion ultimaReparacion() throws arrayVacia{
		if (arReparacion.isEmpty()) {
			Reparacion r=null;
			throw new arrayVacia(r);
		}
		else {
			return arReparacion.get(arReparacion.size()-1);
		}
		
	}
	
	

}
