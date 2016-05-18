import java.util.Scanner;
public class Tablas{
	Scanner teclado;
	int valor;
	public void obtener_valor(){
		teclado = new Scanner(System.in);
		do{
			System.out.println("Indica el valor paras acar tablas");
			valor = teclado.nextInt();
			if(valor == -1)
			break;
			multiplicar(valor);
		}while(valor != -1 );
	}
	public void multiplicar(int valor){
		int t = 0;
		for(int i = 1; i <= 10; i++){
			t = i * valor;
			System.out.println(i + "*" +valor+ "=" + t);
		}
	
	}
	
	public static void main(String[] args){
		Tablas tablas = new Tablas();
		tablas.obtener_valor();
	}
		
} 