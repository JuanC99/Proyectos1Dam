package ej2;

import javax.swing.JFrame;

public class mainEj2 {
	public static void main (String [] args) {
		ConversorEuros conversor = new ConversorEuros();
		conversor.setSize(500, 700);
		conversor.setTitle("Calculador dolares - euros");
		conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		conversor.setVisible(true);
	}

}
