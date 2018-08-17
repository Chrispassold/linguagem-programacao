package PROVA3.Barbeiro;

public class Semaforo {

    private int count;

    public Semaforo(int i) {
        count = i;
    }

    public synchronized void P() {
        if (count <= 0) {
            try {
                System.out.println("Tirar cochilo, sem cliente");
                wait();
            } catch (InterruptedException e) {
                System.out.println("EI, acorda!");
            }
        }
        count--;
    }

    public synchronized void V() {
        count++;
        notify();
    }

}
