package semaforos;

public class Principal {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		Semaforo cheio = new Semaforo(0);
		Semaforo vazio = new Semaforo(5);
		Semaforo mutex = new Semaforo(1);

		Produtor primeiroProdutor = new Produtor("Produtor 1", b, vazio,cheio, mutex, 5);
		Consumidor primeiroConsumidor = new Consumidor("Consumidor 1", b, vazio, cheio, mutex, 5);

		primeiroProdutor.start();
		primeiroConsumidor.start();
	}
}