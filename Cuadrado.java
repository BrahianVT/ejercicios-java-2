import java.util.Scanner;
public class Cuadrado{
	private Scanner teclado;
	private int lado , area, perimetro;
	public void inicializar(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el lado del cuadrado");
		lado = teclado.nextInt();
		}
	public void calcula_area_perimetro(){
	area = lado * 2;
	perimetro = lado * 4;
	}
	public void imprimir(){
	System.out.println("El area es "+area);
	System.out.println("El perimetro es "+perimetro);
	}
	
	public static void main (String[] args){
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.inicializar();
		cuadrado1.calcula_area_perimetro();
		cuadrado1.imprimir();
	
	}
}