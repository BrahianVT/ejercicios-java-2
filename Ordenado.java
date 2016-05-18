import java.util.Scanner;
public class Ordenado{
		Scanner teclado;
		int vector[];
		public void inicializar(){
			teclado = new Scanner(System.in);
			vector = new int[4];
			for(int i = 0; i < 4; i++){
				System.out.println("Indica el numero"+(i+1));
				vector[i] = teclado.nextInt();
			}
		}
		public void ordenado_o_no(){
			int aux = 0;
			aux = vector[0];
			for(int i = 0; i < 3; i++){
			    if(aux < vector[i+1]){
					aux = vector[i+1];
					if(i == 2)
						System.out.println("Esta ordenado ascendentemente");
					}
				else{
					System.out.println("No esta ordenado ascendentemente");
					break;
				}
			}
		}
		
	public static void main(String[] args){
		Ordenado prueba = new Ordenado();
		prueba.inicializar();
		prueba.ordenado_o_no();
	}
		
} 