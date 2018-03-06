package ej1.Calculadora;

import javax.swing.JFrame;

public class maincalc {
	public static void main(String[] args) {
		EjercicioCalculadora frame = new EjercicioCalculadora();
		frame.setSize(350, 250);
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}