package semaforos;

public class Produtor extends Thread {
	private Buffer buffer;
	private Semaforo semProdutor, semConsumidor, mutex; 
	//semProdutor=vazios
	//semConsumidor=cheios
	private int producaoTotal;

	public Produtor(String nome, Buffer dado, Semaforo cheioP, Semaforo vazioP, Semaforo mutex, int producaoTotal) {
		super(nome);
		buffer = dado;
		semProdutor = cheioP;
		semConsumidor = vazioP;
		this.producaoTotal = producaoTotal;
		this.mutex = mutex;
	}

	public void run() {
		for (int i = 1; i <= producaoTotal; i++) {
			semProdutor.P();
			mutex.P();
			buffer.setContador(buffer.getContador() + 1);
			System.out.println("Produzi " + buffer.getContador());
			mutex.V();
			semConsumidor.V();
		}

		System.out.println("Terminou produção");
	}

}
