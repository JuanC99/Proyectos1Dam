package tema9.garaje.tratamientoEx;

public class arrayVacia extends Exception{

	private static final long serialVersionUID = 1L;
	private String valor;
	public arrayVacia(Coche c) {
		valor="El garaje se encuentra vacio";
	}
	public arrayVacia(Reparacion r) {
		valor="El cohe no tiene reparaciones";
	}
	@Override
	public String toString() {
		return valor;
	}
	
	

}
