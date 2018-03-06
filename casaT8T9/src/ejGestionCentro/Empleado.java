package ejGestionCentro;

public abstract class Empleado extends Persona{
	protected int anyoIncorp;
	protected float salario;
	
	public Empleado(String nombre, String apellido, String dni, String estadoCivil, int anyoIncorp, float salario) {
		super(nombre, apellido, dni, estadoCivil);
		this.anyoIncorp=anyoIncorp;
		this.salario=salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getAnyoIncorp() {
		return anyoIncorp;
	}

	public void setAnyoIncorp(int anyoIncorp) {
		this.anyoIncorp = anyoIncorp;
	}

	@Override
	public abstract String toString();
	
	public abstract void calcularSalario(float salarioBase);

}
