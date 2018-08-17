package edmodo.exercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Servidor extends Thread {
    private List<Computador> filaImpressao = new LinkedList<>();
    private List<Impressora> impressoras = new ArrayList<>();

    private int MAX_QUEUE = 3;

    private static Runnable worker = () -> {
    };

    public synchronized boolean queue(Computador computador){
        if(filaImpressao.size() > MAX_QUEUE) return false;
        filaImpressao.add(computador);
        return true;
    }

    public void registrarImpressora(Impressora impressora){
        this.impressoras.add(impressora);
    }

    public Servidor() {
        super(worker);
    }
}
