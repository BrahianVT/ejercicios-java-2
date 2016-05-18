import java.util.Scanner;
public class Calcular{
	private Scanner teclado;
	private int num1, num2;
	
	public Calcular(){
		teclado = new Scanner(System.in);
		System.out.println("Indica el numero1");
		num1 = teclado.nextInt();
		System.out.println("Indica el numero2");
		num2 = teclado.nextInt();
	}
	public void suma(){
		System.out.println("La suma es : "+(num1+num2));
	}
	public void res(){
		System.out.println("La suma es : "+(num1-num2));
	}
	public void mul(){
		System.out.println("La suma es : "+(num1*num2));
	}
	public void div(){
		if(num2 ==0)
			System.out.println("No existe la divicion entre 0");
		double res = 0;
		System.out.println("La divicion es : "+(res = num1/num2));
	}
	
	public static void main (String [] args){
	Calcular datos =new Calcular();
	datos.suma();
	datos.res();
	datos.mul();
	datos.div();
	
	}
}
		
