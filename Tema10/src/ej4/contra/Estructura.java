package ej4.contra;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Estructura extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container container;
	private JTextField texto;
	private JButton boton;
	private validarContra listener;
	private JPanel panel;
	public Estructura(){
		container= this.getContentPane();
		texto = new JTextField(30);
		boton= new JButton("Validar");
		listener=new validarContra(this);
		panel= new JPanel();
		
		panel.add(texto, BorderLayout.WEST);
		panel.add(boton, BorderLayout.EAST);
		
		container.add(panel);
		boton.addActionListener(listener);
		
	}
	public JTextField getTexto() {
		return texto;
	}
	public void setTexto(JTextField texto) {
		this.texto = texto;
	}

}
