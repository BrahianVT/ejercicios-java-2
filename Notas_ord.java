import java.util.Scanner;
public class Notas_ord{
		Scanner teclado;
		String nombres[];
		int n ,notas[];
		public void inicializar(){
			teclado = new Scanner (System.in);
			System.out.println("Cuantas calificaciones ");
			n = teclado.nextInt();
			nombres = new String[n];
			notas = new int[n];
			for(int i = 0; i < nombres.length; i++){
				System.out.println("Indica el nombre");
				nombres[i] = teclado.next();
				System.out.println("Indica la notas");
				notas[i] = teclado.nextInt();				
			}
		}
		public void ordenar_menor(){
			int aux;
			String auxstr;
			for(int i = 0; i < nombres.length-1; i++){
				for(int j = 0; j < (nombres.length-1)-i; j++){
					if(notas[j] < notas[j+1]){
						aux = notas[j];
						notas[j] = notas[j+1];
						notas[j+1] = aux;
						auxstr = nombres[j];
						nombres[j] = nombres[j+1];
						nombres[j+1] = auxstr;
					}
				}
			}
		}
		
		public void imprimir(){
			System.out.println("Notas ordenadas desendentemente:");
			for(int i = 0; i < nombres.length; i++)
				System.out.println(nombres[i] +"  "+ notas[i]);
		
		}
	
		
	public static void main(String[] args){
		Notas_ord prueba = new Notas_ord();
		prueba.inicializar();
		prueba.ordenar_menor();
		prueba.imprimir();
	}
		
} 