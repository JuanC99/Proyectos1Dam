package tema9.garaje.tratamientoEx;

import java.util.ArrayList;

public class Garaje {
	
	private ArrayList<Coche> arCoche= new ArrayList<Coche>(0);
	
	public void agregaCoche(Coche c) throws cocheRepetido{
		boolean encontrado=false;
		for(Coche nuevo:arCoche){
			if(nuevo.getMatricula().equals(c.getMatricula())){
				encontrado=true;
				throw new cocheRepetido(c.getMatricula());
			}
			
		}
		if(encontrado==false){
			arCoche.add(c);
		}
	
	}
	
	public Coche buscaCoche(String matricula) throws CocheNoEncontrado, arrayVacia{
		Coche encontrado= null;
		if (arCoche.isEmpty()) {
			throw new arrayVacia(encontrado);
		}else {
			for(Coche c:arCoche){
				if (c.getMatricula().equals(matricula)){
					encontrado=c;
				}
				
			}
			if (encontrado==null) {
				throw new  CocheNoEncontrado(matricula);
			}
			return encontrado;
		}
		
		
	}

}
