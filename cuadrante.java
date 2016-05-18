import java.util.Scanner;
public class Cuadrante{
	private Scanner teclado;
	private int x =0, y = 0;
	public void definir_cuadrante(){
	 if (x > 0 && y > 0)
		System.out.println("Es el cuadrante I con "+ x + " y " + y + " positivos");
	 if (x < 0 && y > 0)
		System.out.println("Es el cuadrante II con "+ x + " negativo y " + y + " positivo");
	 if (x < 0 && y < 0){
		System.out.println("Es el cuadrante III con "+ x + " y " + y + " negativos");}
		else{
		if(x > 0 && y < 0)
		System.out.println("Es el cuadrante IV con "+ x + " positivo y " + y + " negativo");
		}
	}
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("Indica el valor de X");
		x = teclado.nextInt();
		System.out.println("Indica el valor de Y");
		y = teclado.nextInt();
	}
public static void main (String[] args){
		Cuadrante cuadrante1 = new Cuadrante();
		cuadrante1.inicializar();
		cuadrante1.definir_cuadrante();
	}
}