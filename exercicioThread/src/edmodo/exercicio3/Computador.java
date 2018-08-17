package edmodo.exercicio3;

public class Computador extends Thread {
    private Servidor servidor;

    public Computador(Servidor servidor) {
        this.servidor = servidor;
    }

    static public class Arquivo {
        public String imprimir() {
            return String.valueOf(Math.random() * 10);
        }
    }
}