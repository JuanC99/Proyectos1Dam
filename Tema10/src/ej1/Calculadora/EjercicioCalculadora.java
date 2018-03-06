package ej1.Calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjercicioCalculadora extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField visor;
	private String operador1;
	private String operador2;
	private String operando;
	private Container container;
	private OperatorListener operatorListener;
	private NumericListener numericListener;

	public EjercicioCalculadora() {
		visor = new JTextField(30);
		operador1 = "";
		operador2 = "";
		operando = "";
		container = this.getContentPane();
		numericListener = new NumericListener(this);
		operatorListener = new OperatorListener(this);
		
		container.add(visor, BorderLayout.NORTH);
		
		for(int i=0;i<3;i++){
			new FlowLayout();
			
		}
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new GridLayout(4,5));
		container.add(panelCentro, BorderLayout.CENTER);
		JButton buttonSuma = new JButton("+");
		buttonSuma.addActionListener(operatorListener);
		JButton buttonResta = new JButton("-");
		buttonResta.addActionListener(operatorListener);
		JButton buttonIgual = new JButton("=");
		buttonIgual.addActionListener(operatorListener);
		JButton buttonAC = new JButton("AC");
		buttonAC.addActionListener(operatorListener);
		panelCentro.add(buttonSuma);
		panelCentro.add(buttonResta);
		panelCentro.add(buttonIgual);
		panelCentro.add(buttonAC);
		
		for(int i=0;i<=9;i++){
			
			JButton button = new JButton(""+i);
			button.addActionListener(numericListener);
			panelCentro.add(button);
		}
		
	}
		/*
		 * a COMPLETAR POR EL ALUMNO: COMPOSICION GRAFICA DE LA CALCULADORA Y
		 * AÑADIR A LOS BOTONES NUMERICOS EL LISTENER numericListener
		 */

	public JTextField getVisor() {
		return visor;
	}

	public void setVisor(JTextField visor) {
		this.visor = visor;
	}

	public String getOperador1() {
		return operador1;
	}

	public void setOperador1(String operador1) {
		this.operador1 = operador1;
	}

	public String getOperador2() {
		return operador2;
	}

	public void setOperador2(String operador2) {
		this.operador2 = operador2;
	}

	public String getOperando() {
		return operando;
	}

	public void setOperando(String operando) {
		this.operando = operando;
	}
}
