package tema9.garaje.tratamientoEx;

public class CocheNoEncontrado extends Exception{
	private static final long serialVersionUID = 1L;
	private String valor;
	
	public CocheNoEncontrado(String matricula) {
		valor = matricula;
	}
	@Override
	public String toString() {
		return  valor;
	}
	
	
	

}
