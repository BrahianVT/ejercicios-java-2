// Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento y la fila y columna donde se almacena.
import java.util.Scanner;
public class Matriz_mayor{
	Scanner teclado;
	int mat[][],n,m;
	int aux = 0 , col = 0 , fila = 0;
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
	public void encontrar_mayor(){
		aux = mat[0][0];
		for (int i = 0; i < n; i++){
			for(int j = 0; j < m-1; j++){
				if (aux < mat[i][j+1]){
					aux = mat[i][j+1];
					col = j;  fila = i;
					}
				}
			}
		}
	public void imprimir(){
		for (int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(mat[i][j] + " ");
			}System.out.println();
		}
			
		System.out.println("El dato mayor de la matriz es: "+aux);
		System.out.println("Esta en la fila: "+(fila+1));
		System.out.println("Esta en columna: "+(col+2));
			}
	
	
	public static void main (String [] args){
		Matriz_mayor matriz = new Matriz_mayor();
		matriz.inicializar();
		matriz.encontrar_mayor();
		matriz.imprimir();
	}
		
} 
		
