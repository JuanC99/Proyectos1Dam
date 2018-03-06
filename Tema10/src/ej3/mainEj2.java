package ej3;

import javax.swing.JFrame;

public class mainEj2 {
	public static void main(String [] args){
		
		Conversor pruebaConversor= new Conversor();
		
		pruebaConversor.setSize(500, 700);
		pruebaConversor.setTitle("Calculadora");
		pruebaConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pruebaConversor.setVisible(true);
	}
}
