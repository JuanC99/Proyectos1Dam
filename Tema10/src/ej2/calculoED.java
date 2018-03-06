package ej2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class calculoED implements ActionListener{
	private ConversorEuros conver;
	
	public calculoED(ConversorEuros conver) {
		super();
		this.conver=conver;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		String caso="";
		float valor=0.00F;
		caso=source.getText();
		try {
			switch (caso) {
			case "�-->$":
				valor=Float.parseFloat(conver.getVisor().getText())*1.13F;
				conver.getResultado().setText(String.format(Locale.ENGLISH,"%.2f", valor));
				break;

			case "$-->�":
				valor=Float.parseFloat(conver.getVisor().getText())/1.13F;
				conver.getResultado().setText(String.format(Locale.ENGLISH,"%.2f", valor));
				break;
			}
		}catch(NumberFormatException error) {
			conver.getResultado().setText("Error");
			JOptionPane.showMessageDialog(source, "se ha producido un error");
		}
		
		
	}

}
