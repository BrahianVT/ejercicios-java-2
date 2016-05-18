import java.util.Scanner;
public class Vector3{
		Scanner teclado;
		int vector[];
		public void inicializar(){
			teclado = new Scanner(System.in);
			vector = new float[4];
			for(int i = 0; i < 4; i++){
				System.out.println("Indica el sueldo "+(i+1) + "de ");
				sueldo_manana[i] = teclado.nextFloat();
				System.out.println("Indica el sueldo "+(i+1) + "de la tarde");
				sueldo_tarde[i] = teclado.nextFloat();
			}
		}
		public void gastos(){
			for(int i = 0; i < 4; i++){
				gastos_man = gastos_man + sueldo_manana[i];
				gastos_tar = gastos_tar + sueldo_tarde[i];
			}
			gastos_tol = gastos_man + gastos_tar;
		}
		public void imprimir(){
			System.out.println("Los gastos del sueldo de la manana son " + gastos_man);
			System.out.println("Los gastos del sueldo de la tarde son " + gastos_tar);
			System.out.println("Los gastos totales ascienden a " + gastos_tol);
		}
	
	
		
	public static void main(String[] args){
		Sueldos prueba = new Sueldos();
		prueba.inicializar();
		prueba.gastos();
		prueba.imprimir();
	}
		
} 