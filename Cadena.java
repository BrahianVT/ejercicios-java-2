import java.util.Scanner;
public class Cadena{
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		String cad1 , cad2;
		System.out.println("Indica la primera cadena");
		cad1 = teclado.nextLine();
		System.out.println("Indica la segunda cadena");
		cad2 = teclado.nextLine();
		if(cad1.equals(cad2) == true)
			System.out.println(cad1 + " Es igual a cadena " + cad2);
		else
		System.out.println(cad1 + " No es igual a cadena " + cad2);
		
		if(cad1.equalsIgnoreCase(cad2) ==true)
		System.out.println(cad1 + " Es igual sin tener encuenta mayusculas o minnuscula a cadena " + cad2);
		else
		System.out.println(cad1 + " No es igual sin tener encuenta mayusculas o minnuscula a cadena " + cad2);
		
		if(cad1.compareTo(cad2) == 0)
		System.out.println(cad1 + " Es igual a cadena " + cad2);
		else{
			if(cad1.compareTo(cad2) > 0)
			System.out.println(cad1+ " Es mayor alfabéticamente que "+cad2);
			else
			System.out.println(cad2+ " Es mayor alfabéticamente que "+cad1);
		}
		char caracter1 = cad1.charAt(0);
		System.out.println("El primer caracter de la cadena "+ cad1+ "es "+caracter1);
		
		int largo = cad1.length();
		System.out.println("El largo de "+cad1+ " es" +largo);
		
		String subcadena = cad1.substring(0,3);
		System.out.println("Las primeras 3 letras de "+cad1+" son: "+ subcadena);
		
		int posi = cad1.indexOf(cad2);
		if (posi == -1)
			System.out.println(cad2+ " No esta conteinda "+cad1);
		else
		System.out.println(cad2+ " esta conteinda "+cad1+" apartir del "+ posi);
		
		System.out.println(cad1+ " convertido a mayúsculas es "+cad1.toUpperCase());
        System.out.println(cad1+ " convertido a minúsculas es "+cad1.toLowerCase());        
    }
		
	}

		