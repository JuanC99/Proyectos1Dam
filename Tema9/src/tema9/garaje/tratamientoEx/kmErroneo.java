package tema9.garaje.tratamientoEx;

public class kmErroneo extends Exception{

	private static final long serialVersionUID = 1L;
	private int  kmNuevo, kmAnterior;
	public kmErroneo(int kmAnterior, int kmNuevo){
		this.kmNuevo=kmNuevo;
		this.kmAnterior=kmAnterior;
	}
	@Override
	public String toString() {
		return "Km Anterior: "+kmAnterior+"\tNuevo Kilometraje: "+kmNuevo;
	}
	
	

}
