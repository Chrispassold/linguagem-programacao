package PROVA3.Barbeiro;

public class Barbeiro extends Thread {
    private final Barbearia barbearia;

    public Barbeiro(Barbearia barbearia) {
        this.barbearia = barbearia;
    }

    @Override
    public void run() {
        try{
            barbearia.cortarCabeloCliente();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
