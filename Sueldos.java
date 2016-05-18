import java.util.Scanner;
public class Sueldos{
		Scanner teclado;
		float sueldo_manana[] , sueldo_tarde[],gastos_man = 0,gastos_tar = 0,gastos_tol = 0;
		public void inicializar(){
			teclado = new Scanner(System.in);
			sueldo_manana = new float[4];
			sueldo_tarde = new float[4];
			for(int i = 0; i < 4; i++){
				System.out.println("Indica el sueldo "+(i+1) + "de la manana");
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
			System.out.println("Los gastos del sueldo de la mañana son " + gastos_man);
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