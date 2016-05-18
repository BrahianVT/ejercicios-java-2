import java.util.Scanner;
public class Burbuja{
		Scanner teclado;
		int numeros[],n=0;
		public void inicializar(){
			teclado = new Scanner (System.in);
			System.out.println("Cuantos numeros");
			n = teclado.nextInt();
			numeros = new int[n];
			for(int i = 0; i < numeros.length; i++){
				System.out.println("Indica los numeros");
				numeros[i] = teclado.nextInt();				
			}
		}
		public void ordenar_menor(){
			int aux = 0;
			for(int i = 0; i < numeros.length-1; i++){
				for(int j = 0; j < (numeros.length-1)-i; j++){
					if(numeros[j] > numeros[j+1]){
						aux = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux;
					}
				}
			}
		}
		
		public void imprimir(){
			for(int i = 0; i < numeros.length; i++)
				System.out.print(numeros[i] +",");
		
		}
	
		
	public static void main(String[] args){
		Burbuja prueba = new Burbuja();
		prueba.inicializar();
		prueba.ordenar_menor();
		prueba.imprimir();
	}
		
} 