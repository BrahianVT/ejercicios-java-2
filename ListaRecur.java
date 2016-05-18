//recorrer lista con recursividad
public class ListaRecur {
	class Nodo{
		int info;
		Nodo sig;
	}
	Nodo raiz;
	void insertar(int x){
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
	}
	void imprimirInversa(Nodo aux){
		if(aux != null){
			imprimirInversa(aux.sig);
			System.out.print(aux.info + "-");
		}
	}
	void imprimirInversa(){
		imprimirInversa(raiz);
	}
	public static void main (String[] args){
		ListaRecur prueba = new ListaRecur();
		prueba.insertar(1);
		prueba.insertar(2);
		prueba.insertar(3);
		prueba.insertar(4);
		prueba.insertar(5);
		prueba.imprimirInversa();
	}
}