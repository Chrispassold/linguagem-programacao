package semaforos;

public class Semaforo {

	private int count;

	public Semaforo(int i) {
		count = i;
	}

	public synchronized void P() {
		if (count <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		count--;
	}

	public synchronized void V() {
		count++;
		notify();
	}
}
