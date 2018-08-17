package semaforos;

public class Consumidor extends Thread {

	private Buffer buffer;
	private Semaforo semProdutor, semConsumidor, mutex;
	private int totalConsumir;

	public Consumidor(String nome, Buffer dado, Semaforo sem1, Semaforo sem2, Semaforo mutex, int totalConsumir) {
		super(nome);
		buffer = dado;
		semProdutor = sem1;
		semConsumidor = sem2;
		this.totalConsumir = totalConsumir;
		this.mutex = mutex;

	}

	public void run() {
		int valor = 0;
		// while(true) {
		do {
			// try {
			// Thread.sleep((int) (Math.random() * 1000));
			// } catch (InterruptedException exception) {
			// System.err.println(exception.toString());
			// }
			semConsumidor.P();
			mutex.P();
			buffer.setContador(buffer.getContador() - 1);
			System.out.println("Consumi " + buffer.getContador());
			mutex.V();
			semProdutor.V();

		} while (buffer.getContador()>0);

		System.out.println("Terminou consumo");

	}

}
