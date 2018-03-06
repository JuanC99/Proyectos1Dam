package ejGestionCentro;

import java.util.Scanner;

public class mainGestionCentro {
	public static void main(String args[]) {
		int opcion, tipo, anyosAntiguedad, gestion=0;
		float salario=0.00F;
		String nombre, apellidos, dni, estadoCivil, departamento, curso, seccion="";
		boolean semaforo=false;
		Scanner teclado= new Scanner(System.in);
		Centro batoi = new Centro();
		do {
			System.out.println("---------------------------------");
			System.out.println("Introduzca una de las siguientes opciones:\n1-Dar de alta a un miemrbo\n2-Dar de baja a un miembro\n3-Imprimir listado de miembros del centro"
					+ "\n4-Imprimir listado de empleados\n5-Gestionar miemrbos\n6-Salir\n---------------------------------");
			while(!teclado.hasNextInt()) {
				System.out.println("Introduzca un numero");
				teclado.next();
			}
			opcion=teclado.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("1--Profesor\n2--Alumno\n3--Personal de Servicio");
				while(!teclado.hasNextInt()) {
					System.out.println("Introduzca un numero");
					teclado.next();
				}
				tipo=teclado.nextInt();
				System.out.println("Introduzca el nombre:");
				nombre=teclado.next();
				System.out.println("Introduzca los apellidos");
				teclado.nextLine();
				apellidos=teclado.nextLine();
				System.out.println("Introduzca su dni:");
				dni=teclado.next();
				System.out.println("Introduzca su estado Civil:");
				estadoCivil=teclado.next();
				try{
					switch (tipo) {
					case 1:
						System.out.println("A que departamento pertence?");
						departamento=teclado.next();
						System.out.println("Introduzca el anyo de Incorporacion al centro");
						anyosAntiguedad=teclado.nextInt();
						System.out.println("Cual es su salario?");
						salario=teclado.nextFloat();
						
						Empleado profesor= new Profesores(nombre, apellidos, dni, estadoCivil, departamento, anyosAntiguedad, salario);
						profesor.calcularSalario(salario);
						batoi.darAlta(profesor);
						break;
						
					case 2:
						System.out.println("A que cusro pertenece?");
						teclado.nextLine();
						curso=teclado.nextLine();
						Persona alumno= new Estudiantes(nombre, apellidos, dni, estadoCivil, curso);
						batoi.darAlta(alumno);
						break;
					case 3:
						System.out.println("A que seccion pertence?");
						seccion=teclado.next();
						System.out.println("Introduzca el anyo de Incorporacion al centro");
						anyosAntiguedad=teclado.nextInt();
						System.out.println("Cual es su salario?");
						salario=teclado.nextFloat();
						Empleado personalS= new PersonalServicio(nombre, apellidos, dni, estadoCivil, anyosAntiguedad, seccion,  salario);
						personalS.calcularSalario(salario);
						batoi.darAlta(personalS);
						
						break;
						
					default:
						System.out.println("No ha seleccionado un opcion valida.");
						break;
					}
					
					
				}catch(Error e){
					System.out.println(e.toString());
				}
				
				break;
				
			case 2:
				try{

					if(!batoi.getArCentro().isEmpty()){
						System.out.println("Introduzca el dni de la persona que quiere dar de baja:");
						dni=teclado.next();
						batoi.darBaja(dni);
					}else{
						System.out.println("La array esta vacia");
					}
					
				}catch(Error e){
					System.out.println(e.toString());
				}
				
				
				
				break;
				
			case 3:
				batoi.imprimirIntegrantesCentro();
				break;
				
			case 4:
				batoi.imprimirEmpleados();
				break;
			case 5:
				if(!batoi.getArCentro().isEmpty()){
					System.out.println("Seleccione una de las siguientes opciones:\n1--Cambiar curso de Alumno\n2--Cambiar departamento de profesor\n"
							+ "3--Cambiar seccion del personal de Servicio");
					while(!teclado.hasNextInt()) {
						System.out.println("Introduzca un numero");
						teclado.next();
					}
					gestion=teclado.nextInt();
					System.out.println("Introduzca el dni de la persona en cuestion");
					dni=teclado.next();
					try {
						switch(gestion) {
						case 1:
							System.out.println("Introduzca el nuevo curso del alumno:");
							teclado.hasNextLine();
							curso=teclado.nextLine();
							((Estudiantes)batoi.buscarPersona(dni)).setCurso(curso);
							break;
							
						case 2:
							System.out.println("Introduzca el nuevo departamento del profesor");
							departamento=teclado.next();
							((Profesores)batoi.buscarPersona(dni)).setDepartamento(departamento);
							break;
							
						case 3 :
							System.out.println("Introduzca la nueva seccion del Personal de Servicio");
							seccion=teclado.next();
							((Profesores)batoi.buscarPersona(dni)).setDepartamento(seccion);
							break;
						
						default:
							
							System.out.println("No ha seleccionado una opcion valida");
							break;
						}
					
					}catch(Error e) {
						System.out.println(e.toString());
					}
						
				}else{
					System.out.println("EL centro no tiene personas registradas");
				}
				
					break;
				
			case 6:
				semaforo=true;
				break;
			default:
				System.out.println("No ha introducido una opcion valida");
				break;
			}
		}while(semaforo==false);
		teclado.close();
	}

}
