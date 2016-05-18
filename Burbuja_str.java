import java.util.Scanner;
public class Burbuja_str{
		Scanner teclado;
		String paises[];
		int n ;
		public void inicializar(){
			teclado = new Scanner (System.in);
			System.out.println("Cuantos paises");
			n = teclado.nextInt();
			paises = new String[n];
			for(int i = 0; i < paises.length; i++){
				System.out.println("Indica los paises");
				paises[i] = teclado.next();				
			}
		}
		public void ordenar_menor(){
			String aux;
			for(int i = 0; i < paises.length-1; i++){
				for(int j = 0; j < (paises.length-1)-i; j++){
					if(paises[j].compareTo(paises[j+1]) > 0){
						aux = paises[j];
						paises[j] = paises[j+1];
						paises[j+1] = aux;
					}
				}
			}
		}
		
		public void imprimir(){
			for(int i = 0; i < paises.length; i++)
				System.out.print(paises[i] +",");
		
		}
	
		
	public static void main(String[] args){
		Burbuja_str prueba = new Burbuja_str();
		prueba.inicializar();
		prueba.ordenar_menor();
		prueba.imprimir();
	}
		
} 