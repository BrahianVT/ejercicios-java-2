import java.util.Scanner;
public class Verpar{
		Scanner teclado;
		int edades[];
		String nombres[];
		public void inicializar(){
			teclado = new Scanner (System.in);
			edades = new int[3];
			nombres = new String[3];
			for(int i = 0; i < 3; i++){
				System.out.println("Indica tu edad");
				edades[i] = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Indica tu nombre");
				nombres[i] = teclado.nextLine();				
			}
		}
		public void mayor_18(){
				System.out.println("Personas mayores de 18 anios");
				System.out.println("NOMBRE   EDAD");
			for(int i = 0; i < 3; i++){
				if(edades[i] >= 18){
					System.out.print(nombres[i]+"  ");
					System.out.println(edades[i]);
				}
			}
		}
	
		
	public static void main(String[] args){
		Verpar prueba = new Verpar();
		prueba.inicializar();
		prueba.mayor_18();
	}
		
} 