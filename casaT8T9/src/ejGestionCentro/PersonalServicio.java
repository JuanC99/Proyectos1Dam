package ejGestionCentro;

public class PersonalServicio extends Empleado {
	private String seccion;

	
	public PersonalServicio(String nombre, String apellido, String dni, String estadoCivil, int anyoIncorp, String seccion, float salario) {
		super(nombre, apellido, dni, estadoCivil, anyoIncorp, salario);
		this.seccion=seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}



	@Override
	public String toString() {
		return "PersonalServicio-- Seccion: " + seccion + "\tAnyo de Incorporacion: " + anyoIncorp + "\tSalario: " + salario
				+ "\tNombre: " + nombre + "\tApellidos: " + apellido + "\tDNI: " + dni + "\tEstado Civil: " + estadoCivil;
	}

	@Override
	public void calcularSalario(float salarioBase) {
		if(this.getEstadoCivil().equalsIgnoreCase("casado")) {
			this.salario=salarioBase*1.05F;
		}else {
			this.salario=salarioBase;
		}
	}
	


}
