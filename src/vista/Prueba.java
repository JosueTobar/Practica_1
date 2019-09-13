package vista;
import java.util.*;

import fundamentosPOO.Auto;
import fundamentosPOO.Moto;
import sv.com.banco.Cuenta;
public class Prueba {

	public static void main(String[] args) {
		Integer subMenu = 0;
		Integer menu = 0;
		Auto objA = new Auto();
		Moto objM = new Moto();
		Cuenta cut = new Cuenta();
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("---------- MENU -----------------------");
			System.out.println("Ejercicio Herencia -----------------: 1");
			System.out.println("Ejercicio BAnco    -----------------: 2");
			menu = leer.nextInt();
			if(menu == 1) {
				

				do {
					System.out.println("-------------- Ejercicio 1 ---------------");
					System.out.println("----------- sub Menu Herencia ------------");
					System.out.println(" encender Auto -------------------------: 1 ");
					System.out.println(" encender Moto -------------------------: 2 ");
					System.out.println(" salir ---------------------------------: 0 ");
					System.out.print("selecione una opción -------------------:  ");
					System.out.print(" Elija una opción y precione enter:  ");
					subMenu = leer.nextInt();
					
					switch (subMenu) {
					case 1:
						objA.encender();
						break;
					case 2:
						objM.encender();
						break; 
					default:
						break;
					} 
				}while(subMenu !=0);
				
				
			}else if(menu == 2) {
				
				do {
					System.out.println("------------ Ejercicio 1 ------------------");
					System.out.println("---------- sub Menu Banco -----------------");
					System.out.println(" Ingresar Datos de Cuenta --------------: 1 ");
					System.out.println(" Datos de Cuenta -----------------------: 2 ");
					System.out.println(" salir ---------------------------------: 0 ");
					System.out.print("selecione una opción ---------------------:  ");
					subMenu = leer.nextInt();
					
					switch (subMenu) {
					case 1://Ingresar paramteros 
						System.out.print("Ingrese el nombre del Cliente: ");
						cut.setNombreCiente(leer.next());
						System.out.print("Ingrese el numero del Cliente: ");
						cut.setNumeroCuenta(leer.next());
						System.out.print("Ingrese el Interes: ");
						cut.setTipoInteres(leer.nextDouble());
						System.out.print("Ingrese el Saldo: ");
						cut.setSaldo(leer.nextDouble());
						
						break;
					case 2: //monstrar los datos 
						System.out.println("Nombre :"+cut.getNombreCiente());
						System.out.println("Numero de Cuenta :"+cut.getNumeroCuenta());
						System.out.println("Interes :"+cut.getTipoInteres());
						System.out.println("Saldo :"+cut.getSaldo());
						System.out.println("---------------------------------------");
						break;
					default:
						break;
					}
					
				}while(subMenu !=0);	
				
			}
			
		}while(menu !=0);
		
	}

}
