package Main;

import java.util.Scanner;

import Dominio.Llantas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		long codigoDeBarra;
		String marca;
		String medidas;
		float precio;
		int exitencia, menuP;
		
		Llantas llanta;
		
		LogicaMetodos impl = new LogicaMetodos();
		boolean salir = false;
		
		try {
		do {
			System.out.println("**** Menu principal ****\n" +
							   "1.-Alta\n" +
							   "2.-Mostrar\n" +
							   "3.-Buscar\n" +
							   "4.-Editar\n" +
							   "5.-Eliminar\n" +
							   "6.-Salir\n" +
							   "Elige alguna opcion:");
			lectura = new Scanner(System.in);
			menuP = lectura.nextInt();
			System.out.println();
			switch (menuP) {
			case 1:
				try {
					System.out.println("Ingresa el codigo de barras");
					lectura = new Scanner(System.in);
					codigoDeBarra = lectura.nextLong();
					
					System.out.println("Ingresa la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingresa la medida");
					lectura = new Scanner(System.in);
					medidas = lectura.nextLine();
					
					System.out.println("Ingresa el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingresa las exitencias");
					lectura = new Scanner(System.in);
					exitencia = lectura.nextInt();
					
					impl.guardar(llanta = new Llantas(codigoDeBarra, marca, medidas, precio, exitencia) );
					
					System.out.println("Datos guardados exitosamente\n");
				} catch (Exception e) {
					// TODO: handle exception
					
					System.out.println("Error al guardar " + e.getMessage()+"\n");
				}
				break;
			case 2:
				impl.mostrar();
				break;
			case 3:
				try {
					System.out.println("Ingrese el codigo de barra para buscar registro");
					lectura = new Scanner(System.in);
					codigoDeBarra = lectura.nextLong();
					
					llanta = impl.biuscar(codigoDeBarra);
					
					if (llanta != null) {
						System.out.println("Se econtro el resgistro\n" + llanta + "\n");
					} else {
						System.out.println("No exite ese registro\n");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar\n");
				}
				break;
			case 4:
				try {
				System.out.println("Ingresa el codigo de barra para editar el registro");
				lectura = new Scanner(System.in);
				codigoDeBarra = lectura.nextLong();
				
				//Buscar
				llanta = impl.biuscar(codigoDeBarra);
				
				if (llanta != null) {
					System.out.println("Se econtro el resgistro\n" + llanta + "\n");
				
					//Actualizacion
					
					System.out.println("Ingrese la nueva marca");
					lectura = new Scanner(System.in);
					marca =  lectura.nextLine();
					
					//Actualizar al objeto
					
					llanta.setMarca(marca);
					
					//Actualizar en el HashMap
					impl.editar(llanta);
					
					System.out.println("Se edito con exiton\n");
					
				} else {
					System.out.println("No existe ese registro/n");
				}
				
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al editar\n");
					
				}
				break;
			case 5:
				try {
				System.out.println("Ingrese el codigo de barra para eliminar");
				lectura = new Scanner(System.in);
				codigoDeBarra = lectura.nextLong();
				
				//Eliminacion
				impl.eliminar(codigoDeBarra);
				System.out.println("Se elimino\n");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar\n");
					System.out.println("Hola esta es una prueba ");
				}
				break;
			case 6:
				salir = true;
				break;

			default:
				System.out.println("La opcion: " + menuP + " No pertenece a nuestro menu\n");
			}
					
		} while (!salir);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
		
	}

}
