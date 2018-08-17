package monitores;
public class Consumidor extends Thread {
	private int idConsumidor;
	private Buffer buffer;
	private int totalConsumir;

	public Consumidor(int id, Buffer p, int totalConsumir) {
		idConsumidor = id;
		buffer = p;
		this.totalConsumir = totalConsumir;
	}

	public void run() {
		for (int i = 0; i < totalConsumir; i++) {
			buffer.get(idConsumidor);
		}
		System.out.println("Consumidor #" + idConsumidor + " concluido!");
	}
}
