import java.util.Scanner;
public class Verposme{
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
		public void menor(){
			int aux = numeros[0],j=0,aux2=0;
			for(int i = 0; i < numeros.length-1; i++){
				if(aux > numeros[i+1])
					aux = numeros[i+1];
			}
			for(int i = 0; i < numeros.length; i++){ 
			if(aux == numeros[i])
			{j=i; aux2++;}
			}
			System.out.println("El dato menor es " +aux+ " en posicion " +(j+1));
			if(aux2 > 1)
			System.out.println("El dato menor esta repetido");
		}
	
		
	public static void main(String[] args){
		Verposme prueba = new Verposme();
		prueba.inicializar();
		prueba.menor();
	}
		
} 