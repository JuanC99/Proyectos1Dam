package ej1.Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OperatorListener implements ActionListener{
	EjercicioCalculadora ventana = null;

	public OperatorListener(EjercicioCalculadora ventana) {
		super();
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		String _operator = source.getText();
		try{
			switch (_operator) {
			case "+":
				this.ventana.setOperador1(this.ventana.getVisor().getText());
				this.ventana.setOperando("+");
				this.ventana.getVisor().setText("");
				break;
			case "-":
				this.ventana.setOperador1(this.ventana.getVisor().getText());
				this.ventana.setOperando("-");
				this.ventana.getVisor().setText("");
				
				break;
			case "=":
				this.ventana.setOperador2(this.ventana.getVisor().getText());
				int result = 0;
				if (this.ventana.getOperando().equals("+")){
					result=Integer.parseInt(this.ventana.getOperador1())+Integer.parseInt(this.ventana.getOperador2());
				}
				else if(this.ventana.getOperando().equals("-")){
					result=Integer.parseInt(this.ventana.getOperador1())-Integer.parseInt(this.ventana.getOperador2());
				}
				
				/* a COMPLETAR POR EL ALUMNO->CALCULO DEL RESULTADO */
				this.ventana.getVisor().setText("" + result);
				break;
			case "AC":
				this.ventana.getVisor().setText("");
				break;
			}
			
		}catch(NumberFormatException error){
			this.ventana.getVisor().setText("Error");
			}
		
	}

}
