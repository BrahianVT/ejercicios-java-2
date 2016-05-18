// Creacion de un arbol binario ordenado 
import java.util.Scanner;
public class ArbolBinario{
	class Nodo{
		int info;
		Nodo izq , der;
	}
	private Nodo raiz;
	int cant;
    int altura;
	public ArbolBinario(){ raiz = null;}
	public void insertar(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.izq = null;
		nuevo.der = null;
		if(raiz == null)
			raiz = nuevo;
		else{
			Nodo anterior = null , reco;
			reco = raiz;
			while(reco != null){
				anterior = reco;
				if(x < reco.info)
					reco = reco.izq;
					else
					reco = reco.der;
			}
			if (x < anterior.info)
				anterior.izq = nuevo;
			else
				anterior.der = nuevo;
			}
	}
	boolean existe (int info){
		Nodo reco = raiz;
		while( reco != null){
			if(info == reco.info)
				return true;
			else
				if(info > reco.info)
					reco = reco.der;
				else
					reco = reco.izq;
		}
		return false;
	}
	private void cantidad(Nodo reco){
		if(reco !=null){
			cant++;
			cantidad(reco.izq);
			cantidad(reco.der);
		}
	}
	public int cantidad(){
		cant = 0;
		cantidad(raiz);
		return cant;
	}
	private void cantidadDeNodosHoja(Nodo reco){
		if (reco != null){
			if(reco.der == null && reco.izq == null)
				cant++;
			cantidadDeNodosHoja(reco.izq);
			cantidadDeNodosHoja(reco.der);
		}
	}
	public int cantidadDeNodosHoja(){
		cant = 0;
		cantidadDeNodosHoja(raiz);
		return cant;
	}
	private void imprimirEntreConNivel(Nodo reco , int nivel){
		if(reco != null){
			imprimirEntreConNivel(reco.izq , nivel + 1);
			System.out.println(reco.info + " (" + nivel +") -");
			imprimirEntreConNivel(reco.der , nivel + 1);
		}
	}
	public void imprimirEntreConNivel(){
		imprimirEntreConNivel(raiz , 1);
		System.out.println();
	}
	private void retornarAltura(Nodo reco, int nivel){
		if(reco != null){
			retornarAltura(reco.izq , nivel +1);
			if(nivel > altura)
				altura = nivel;
			retornarAltura(reco.der , nivel +1);
		}
	}
	public int retornarAltura(){
		altura = 0;
		retornarAltura(raiz , 1);
		return altura;
	}
	public void mayorValor(){
		if(raiz != null){
			Nodo reco = raiz;
			while(reco.der != null)
				reco = reco.der;
			System.out.println("Mayor valor del árbol: "+reco.info);
		}
	}
	public void borrarMenor(){
		if(raiz != null){
			if(raiz.izq == null)
				raiz = raiz.der;
			else{
				Nodo atras = raiz;
				Nodo reco = raiz.izq;
				while(reco.izq != null){
					atras = reco;
					reco = reco.izq;
				}
				atras.izq = reco.der;
			}
		}
	}
	private void imprimirPre(Nodo reco){
		if(reco != null){
			System.out.print(reco.info + " ");
			imprimirPre(reco.izq);
			imprimirPre(reco.der);
		}
	}
	public void imprimirPre(){
		imprimirPre(raiz);
		System.out.println();
	}
	private void imprimirEntre(Nodo reco){
		if(reco != null){
			imprimirEntre(reco.izq);
			System.out.print(reco.info + " ");
			imprimirEntre(reco.der);
		}
	}
	public void imprimirEntre(){
		imprimirEntre(raiz);
		System.out.println();
	}
	private void imprimirPost(Nodo reco){
		if(reco != null){
			imprimirPost(reco.izq);
			imprimirPost(reco.der);
			System.out.print(reco.info + " ");
		}
	}
	public void imprimirPost(){
		imprimirPost(raiz);
		System.out.println();
	}
	
	public static void main (String [] args){
		ArbolBinario abo = new ArbolBinario();
		abo.insertar (100);
          abo.insertar (50);
          abo.insertar (25);
          abo.insertar (75);
          abo.insertar (150);
          System.out.println ("Impresion preorden: ");
          abo.imprimirPre ();
          System.out.println ("Impresion entreorden: ");
          abo.imprimirEntre ();
          System.out.println ("Impresion postorden: ");
          abo.imprimirPost ();        		
		System.out.println ("Cantidad de nodos del árbol:"+abo.cantidad());
        System.out.println ("Cantidad de nodos hoja:"+abo.cantidadDeNodosHoja());          
        System.out.println ("Impresion en entre orden junto al nivel del nodo.");
        abo.imprimirEntreConNivel();
        System.out.print ("Artura del arbol:");
        System.out.println(abo.retornarAltura());        
        abo.mayorValor();
        abo.borrarMenor();
        System.out.println("Luego de borrar el menor:");
        abo.imprimirEntre ();	
	}
		
} 
		
