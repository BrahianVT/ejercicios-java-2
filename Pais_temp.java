// Imprime el pais de lapersona con mayor salario 
import java.util.Scanner;
public class Pais_temp{
	Scanner teclado;
	int n ,m = 3;
	float temperatura[][],temp_prom[];
	String pais[];
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("indica numero de Paises analizar ");
		n = teclado.nextInt();
		pais = new String[n];
		temperatura = new float[n][m];
		temp_prom = new float[n];
		float aux = 0; 
		for (int i = 0; i < n; i++){
					System.out.println("Indica el pais "+(i+1));
					pais[i] = teclado.next();
				for(int j = 0; j < m; j++){
					System.out.println("Indica la temperatura "+(j+1));
					temperatura[i][j] = teclado.nextFloat();
					aux = aux + temperatura[i][j];
				}
			temp_prom[i] = aux / 3 ;
			aux = 0;
			System.out.println("-------------------");
			}	
		
	}

	public void imprimir(){
	System.out.println("paiss     temperaturas     Temperatura Promedio");
			for (int k = 0; k < n; k++){
				System.out.print(pais[k]+ "     ");
				for(int j = 0; j < m; j++){
					System.out.print(temperatura[k][j] + " ");
				}
			System.out.println("     " +temp_prom[k]);
			}
		}
	public void mayor_temperatura(){
		float aux2 = temp_prom[0];
		int i2 = 0;
		for(int i = 0; i < n-1; i++){
			if(aux2 < temp_prom[i+1]){
				aux2 = temp_prom[i+1];	
				i2 = i+1;
			}
		}
	System.out.println("El pais con mayor temperatura promedio  es "+pais[i2]); 
	}
	public static void main (String [] args){
	 Pais_temp prueba = new Pais_temp();
	 prueba.inicializar();
	 prueba.imprimir();
	 prueba.mayor_temperatura();
	}
		
} 
		
