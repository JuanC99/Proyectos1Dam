package ejGestionCentro;

public class Error extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String valor;
	public Error(int i){
		switch (i) {
		case 1:
			valor="La persona ya existe";
			break;
		case 2:
			valor="La persona no se ha encotrado";
			break;
		default:
			
			break;
		}
		
	}
	@Override
	public String toString() {
		return valor;
	}
	


}
