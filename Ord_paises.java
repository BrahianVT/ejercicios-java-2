import java.util.Scanner;
public class Ord_paises{
		Scanner teclado;
		String paises[];
		int n ,poblacion[];
		public void inicializar(){
			teclado = new Scanner (System.in);
			System.out.println("Cuantas Paises ");
			n = teclado.nextInt();
			paises = new String[n];
			poblacion = new int[n];
			for(int i = 0; i < paises.length; i++){
				System.out.println("Indica el pais");
				paises[i] = teclado.next();
				System.out.println("Indica la poblacion");
				poblacion[i] = teclado.nextInt();				
			}
		}
		public void ordenar_menor(){
			int aux;
			String auxstr;
			for(int i = 0; i < paises.length-1; i++){
				for(int j = 0; j < (paises.length-1)-i; j++){
					if(paises[j].compareTo(paises[j+1]) > 0){
						auxstr = paises[j];
						paises[j] = paises[j+1];
						paises[j+1] = auxstr;
						aux = poblacion[j];
						poblacion[j] = poblacion[j+1];
						poblacion[j+1] = aux;
					}
				}
			}
		}
		
		public void imprimir(){
			System.out.println("Ordenados en paises ascendentes: ");
			for(int i = 0; i < paises.length; i++){
				System.out.println(paises[i] +"  "+ poblacion[i]);
			}
			System.out.println("Ordenados  descendente por poblacion:");
			for(int i = paises.length-1; i >= 0; i--){
				System.out.println(paises[i] +"  "+ poblacion[i]);
			}
		}
	
		
	public static void main(String[] args){
		Ord_paises prueba = new Ord_paises();
		prueba.inicializar();
		prueba.ordenar_menor();
		prueba.imprimir();
	}
		
} 