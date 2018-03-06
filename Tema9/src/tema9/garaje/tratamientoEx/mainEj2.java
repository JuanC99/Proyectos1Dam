package tema9.garaje.tratamientoEx;

import java.util.Scanner;

public class mainEj2 {
	public static void main(String [] args){
		int opcion=0;
		boolean semaforo=false;
		String matricula="";
		String direccion="";
		int kms=0;
		String descripcion="";
		String palabraClave="";
		
		Garaje miGaraje= new Garaje();
		Scanner teclado= new Scanner(System.in);
		do{
			System.out.println("----------------------------------------------------");
			System.out.println("Introduzca alguna de las siguientes opciones:\n1-Asociar reparacion\n"
					+ "2-Ultima reparacion\n3-Buscar\n4-Agregar coche\n5-Salir");
			while(!teclado.hasNextInt()){
				System.out.println("Introduzca una opcion valida");
				teclado.nextInt();
			}
			opcion=teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca la matricula del coche que quiere reparar");
				matricula=teclado.next();
				System.out.println("Introduzca los kms");
				while(!teclado.hasNextInt()){
					System.out.println("Introduzca un dato valido");
					teclado.nextInt();
				}
				kms=teclado.nextInt();
				System.out.println("Introduzca una pequenya descripcion");
				teclado.nextLine();
				descripcion=teclado.nextLine();
				Reparacion r= new Reparacion(descripcion, kms);
				try{
					miGaraje.buscaCoche(matricula).agregaReparacion(r);
				}catch (CocheNoEncontrado e){
					System.out.println("No se encotro el coche con la matricula: "+e.toString());
				}catch (arrayVacia e) {
					System.out.println(e.toString());
				} catch (kmErroneo e) {
					
					System.out.println("El nuevo Kilometraje no puede ser inferior al de la ultima reparacion."+e.toString());
				}
				
				break;

			case 2:
				System.out.println("Introduzca la matricula del coche que desea consultar:");
				matricula=teclado.next();
				try{
					miGaraje.buscaCoche(matricula);
					System.out.println("La ultima reparacion del coche con la matricula "+miGaraje.buscaCoche(matricula).getMatricula()+ " se realizo en el Km: "+miGaraje.buscaCoche(matricula).ultimaReparacion().getKms()
							+" y tiene la siguiente descripcion asociada: "+miGaraje.buscaCoche(matricula).ultimaReparacion().getDescripcion());
					
				}catch(CocheNoEncontrado e){
					System.out.println("No se econtro el coche con la matricula: "+e.toString());
					
				}catch(arrayVacia e) {
					System.out.println(e.toString());
				}
				
				
				
				
				break;
			
			case 3:
				System.out.println("Introduzca la matricula del cohe que desea buscar:");
				matricula=teclado.next();
				System.out.println("Introuzca el criterio de busqueda");
				palabraClave=teclado.next();
				try {
					for (Reparacion rep: miGaraje.buscaCoche(matricula).buscaReparaciones(palabraClave)) {
						System.out.println("Kms:\t"+rep.getKms()+"\tDescripcion:\t"+rep.getDescripcion());
					}
				}catch(CocheNoEncontrado e){
					System.out.println("No se econtro el coche con la matricula: "+e.toString());
				}catch(arrayVacia e){
					System.out.println("El garaje esta vacio");
				}
				System.out.println("Ha finalizado la busqueda");
				
				break;
				
			case 4:
				
				System.out.println("Introduzca la matricula del coche.");
				matricula=teclado.next();
				System.out.println("Introduzca la direccion del duenyo.");
				teclado.nextLine();
				direccion=teclado.nextLine();
				Coche c = new Coche(matricula, direccion);
				try {
					miGaraje.agregaCoche(c);
				} catch (cocheRepetido e) {
					System.out.println("El coche con la matricula: "+e.toString()+" ya ha sido introducido");
				}
				break;
				
			case 5:
				semaforo=true;
				break;
			default:
				break;
			}
		}while(semaforo==false);
		
		
		
		
		
		
		teclado.close();
	}

}
