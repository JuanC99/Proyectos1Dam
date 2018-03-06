package tema9.garaje.tratamientoEx;

public class cocheRepetido extends Exception{

	
	private static final long serialVersionUID = 1L;
	private String valor;
	public cocheRepetido(String matricula) {
		valor=matricula;
	}
	@Override
	public String toString() {
		return valor;
	}
	
}
