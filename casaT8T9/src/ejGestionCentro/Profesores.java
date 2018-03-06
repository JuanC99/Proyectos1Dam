package ejGestionCentro;

public class Profesores extends Empleado{
	
	private String departamento;

	
	public Profesores(String nombre, String apellido, String dni, String estadoCivil, String departamento, int anyoIncorp, float salario) {
		super(nombre, apellido, dni, estadoCivil, anyoIncorp, salario);
		this.departamento=departamento;
	}
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	


	@Override
	public String toString() {
		return "Profesor-- Departamento: " + departamento + "\tAnyo de Incorporacion: " + anyoIncorp + "\tSalario: " + salario
				+ "\tNombre: " + nombre + "\tApellido: " + apellido + "\tDNI: " + dni + "\t Estado Civil: " + estadoCivil;
	}

	@Override
	public void calcularSalario(float salarioBase) {
		if(this.getAnyoIncorp()<2000) {
			this.salario=salarioBase*1.08F;
			
		}else {
			this.salario=salarioBase;
		}
	}

}
