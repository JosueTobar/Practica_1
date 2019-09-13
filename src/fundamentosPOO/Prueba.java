package fundamentosPOO;
import java.util.*;
public class Prueba {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Auto objA = new Auto();
		Moto objM = new Moto();
		
		
		Integer op = 0;
		do {
			System.out.println("------------------- Menu -----------------");
			System.out.println(" encender Auto ------------------------- 1 ");
			System.out.println(" encender Moto ------------------------- 2 ");
			System.out.print(" Elija una opción y precione enter:  ");
			op = leer.nextInt();
			
			switch (op) {
			case 1:
				objA.encender();
				break;
			case 2:
				objM.encender();
				break; 
			default:
				break;
			} 
		}while(op !=0);
	}
}
