package ej3;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conversor extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField visor;
	private JTextField resultado;
	
	private Container container;
	private JPanel panelCentro;
	private Calculo calcListener;
	public Conversor(){
		visor=new JTextField(10);
		panelCentro= new JPanel();
		resultado=new JTextField(10);
		calcListener= new Calculo(this);
	
		container=this.getContentPane();
		container.add(resultado, BorderLayout.EAST);
		container.add(visor, BorderLayout.WEST);
		container.add(panelCentro, BorderLayout.CENTER);
		JButton boton=new JButton("Letra");
		container.add(boton,  BorderLayout.CENTER);
		boton.addActionListener(calcListener);
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
