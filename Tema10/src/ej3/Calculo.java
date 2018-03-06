package ej3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculo implements ActionListener{
	private Conversor conver;
	private String dni;
	
	public Calculo (Conversor conver) {
		super();
		this.conver=conver;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			dni=this.conver.getVisor().getText();
			this.conver.getResultado().setText(calculaLetra(Integer.parseInt(dni)));
		}catch(NumberFormatException error) {
			this.conver.getResultado().setText("Error");
		}
		
		
		
		
	}
	String calculaLetra(int dni) {
		 String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
		 int modulo= dni % 23;
		 char letra = juegoCaracteres.charAt(modulo);
		 return ""+letra;
		} 

}
