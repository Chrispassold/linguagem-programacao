package monitores;
public class Teste {

	public static void main(String[] args) {
		Buffer bufferCompartilhado = new Buffer();
		Produtor produtor1 = new Produtor(1, bufferCompartilhado, 10);
		Produtor produtor2 = new Produtor(2, bufferCompartilhado, 5);
		Consumidor consumidor1 = new Consumidor(1, bufferCompartilhado, 10);
		//Consumidor consumidor2 = new Consumidor(2, bufferCompartilhado, 8);
		produtor1.start();
		consumidor1.start();
		produtor2.start();
		//consumidor2.start();
	}
}
