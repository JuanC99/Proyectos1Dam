package ej2;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversorEuros extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField visor;
	private JTextField resultado;
	
	private Container container;
	private JPanel	panelCentro;
	private JButton pasarDolares;
	private JButton pasarEuros;
	private calculoED listenerBoton;

	public ConversorEuros(){
		visor = new JTextField(10);
		resultado= new JTextField(10);
		panelCentro= new JPanel();
		pasarEuros= new JButton("�-->$");
		pasarDolares= new JButton("$-->�");
		listenerBoton= new calculoED(this);
		
		container = this.getContentPane();
		container.add(visor, BorderLayout.WEST);
		container.add(resultado, BorderLayout.EAST);
		panelCentro.add(pasarDolares, BorderLayout.NORTH);
		panelCentro.add(pasarDolares, BorderLayout.SOUTH);
		panelCentro.add(pasarEuros);
		container.add(panelCentro, BorderLayout.CENTER);
		
		
		
		pasarDolares.addActionListener(listenerBoton);
		pasarEuros.addActionListener(listenerBoton);
	}


	public JTextField getVisor() {
		return visor;
	}


	public void setVisor(JTextField visor) {
		this.visor = visor;
	}


	public JTextField getResultado() {
		return resultado;
	}


	public void setResultado(JTextField resultado) {
		this.resultado = resultado;
	}
}
