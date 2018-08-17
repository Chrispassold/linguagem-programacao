package monitores;
public class Produtor extends Thread {
	private int idProdutor;
	private Buffer buffer;
	private int producaoTotal;

	public Produtor(int id, Buffer p, int producaoTotal) {
		idProdutor = id;
		buffer = p;
		this.producaoTotal = producaoTotal;
	}

	public void run() {
		for (int i = 0; i < producaoTotal; i++) {
			buffer.set(idProdutor, i);
		}
		System.out.println("Produtor #" + idProdutor + " concluido!");
	}
}
