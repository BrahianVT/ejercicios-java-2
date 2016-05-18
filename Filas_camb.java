// Crea una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz.
import java.util.Scanner;
public class Filas_camb{
	Scanner teclado;
	int mat[][],n,m;
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("indica las filas ");
		n = teclado.nextInt();
		System.out.println("indica las columnas ");
		m = teclado.nextInt();
		mat = new int[n][m];
			for (int i = 0; i < n; i++){
				System.out.println("Indica los datos ");
				for(int j = 0; j < m; j++){
					mat[i][j] = teclado.nextInt();
				}
			}	
		
	}
	public void cambiar_filas(){
	int aux = 0 ;
	int i = 0;
		for(int j = 0; j < m; j++){
			 aux = mat[i][j];
			 mat[i][j] = mat[i+1][j];
			 mat[i+1][j] = aux;
			}
			
	}
	public void imprimir(){
	System.out.println("matriz con filas cambiadas : ");

		for (int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(mat[i][j] + " ");
			}System.out.println();
		}
		
	}
	
	
	public static void main (String [] args){
		Filas_camb matriz = new Filas_camb();
		matriz.inicializar();
		matriz.cambiar_filas();
		matriz.imprimir();
	}
		
} 
		
