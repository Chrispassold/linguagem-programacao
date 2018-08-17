package PROVA3.Barbeiro;

public class Cliente extends Thread {

    private final Barbearia barbearia;

    public Cliente(Barbearia barbearia) {
        this.barbearia = barbearia;
    }

    @Override
    public void run() {
        try {
            barbearia.entrarNoBarbeiro();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
