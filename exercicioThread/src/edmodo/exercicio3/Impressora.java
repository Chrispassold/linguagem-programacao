package edmodo.exercicio3;

public class Impressora extends Thread {
    private Servidor servidor;

    public Impressora(Servidor servidor) {
        this.servidor = servidor;
    }

    public void imprimir(Computador.Arquivo arquivo) {
        System.out.println(String.format("Impressão: %s", arquivo.imprimir()));
    }
}
