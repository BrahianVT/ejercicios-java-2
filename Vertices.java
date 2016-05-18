// Crea una matriz de n * m filas (cargar n y m por teclado) imprimelos vertices  
import java.util.Scanner;
public class Vertices{
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

	public void imprimir(){
	System.out.println("los vertices de la matriz son : ");
	System.out.println("Vertice superior izquierdo: "+ mat[0][0]);
	System.out.println("Vertice superior derecho: "+ mat[0][m-1]);
	System.out.println("Vertice inferior izquierdo: "+ mat[n-1][0]);
	System.out.println("Vertice inferior derecho: "+ mat[n-1][m-1]);
			
		}
		
	
	
	
	public static void main (String [] args){
		Vertices matriz = new Vertices();
		matriz.inicializar();
		matriz.imprimir();
	}
		
} 
		
