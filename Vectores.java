import java.util.Scanner;
public class Vectores{
		Scanner teclado;
		float alturas[], prom;
		int mayor = 0 , menor = 0;
		public void inicializar(){
			teclado = new Scanner(System.in);
			alturas = new float[5];
			for(int i = 0; i < 5; i++){
				System.out.println("Indica la altura "+(i+1));
				alturas[i] = teclado.nextFloat();
			}
		}
		public void promedio(){
			float aux = 0;
			for(int i = 0; i < 5; i++){
				aux = aux + alturas[i];
			}
			prom = aux / 5;
			for(int i = 0; i < 5; i++){
				if(prom >= alturas[i])
					mayor++;
				else
					menor++;
			}
		}
		public void imprimir(){
			System.out.println("El promedio de alturas es: "+ prom);
			System.out.println("Numero de personas debajo del promedio : "+ menor);
			System.out.println("Numero de personas arriba del promedio : "+ mayor);
		}
	
	
		
	public static void main(String[] args){
		Vectores prueba = new Vectores();
		prueba.inicializar();
		prueba.promedio();
		prueba.imprimir();
	}
		
} 