package ej4.contra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class validarContra implements ActionListener{

	private Estructura ventana = null;
	public validarContra(Estructura ventana){
		super();
		this.ventana=ventana;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		validar(ventana.getTexto().getText());
		
	}
	private void validar(String contra){
		String numeros = "0123456789";
		String contraM=numeros.toUpperCase();
		boolean contieneNumero = false;
		boolean mayus=false;
		if(contra.length()<8){
			JOptionPane.showMessageDialog(null, "Debe tener al menos 8 digitos");
			
		}
		else{
			for(int i=0; i<contra.length() && contieneNumero==false; i++){
				if (numeros.contains(""+contra.charAt(i))){
				contieneNumero=true;
				
				}
			}
			if(contieneNumero==false){
				JOptionPane.showMessageDialog(null, "Debe tener al menos un numero");
			}
			else{
				for(int i=0;i<contraM.length() && mayus==false; i++){
					if (!numeros.contains(""+contraM.charAt(i))){
						if(contra.charAt(i)==contraM.charAt(i)){
							mayus=true;
						}
					}
				}
				if (mayus==true){
					JOptionPane.showMessageDialog(null, "Debe tener una mayuscula");
				}
				else{
					JOptionPane.showMessageDialog(null, "Valida");
				}
				
			}
			
		}
		
	}

}
