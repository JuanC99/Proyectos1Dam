package ejGestionCentro;

public class Estudiantes extends Persona{
	
	private String curso;

	
	public Estudiantes(String nombre, String apellido, String dni, String estadoCivil, String curso) {
		super(nombre, apellido, dni, estadoCivil);
		this.curso=curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante-- Curso:" + curso + "\tNombre=" + nombre + "\t Apellido: " + apellido + "\t DNI: " + dni
				+ "\tEstado Civil: " + estadoCivil;
	}

}
