package PROVA3.Barbeiro;

import java.util.LinkedList;

/*
*
* O semaforo foi escolhido pois assim podemos ter a contagem de recursos disponiveis, que no caso
* seria as cadeiras.
*
* */

public class Barbearia {

    private Semaforo barber;
    private Semaforo client;
    private LinkedList<Object> chairs = new LinkedList<>();

    public void entrarNoBarbeiro() {

        try {
            while (true) {
                if (this.chairs.size() < 5) {
                    this.client.P();
                    this.chairs.addLast(new Object());
                    this.barber.V();
                } else {
                    System.out.println("Não tem lugar, volto outra hora...");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void cortarCabeloCliente(){

        try {

            while (true){
                if (this.chairs.isEmpty()){
                    this.barber.P();
                    this.client.V();
                } else {
                    this.barber.P();
                    this.chairs.removeFirst();
                    System.out.println("Cortando o cabelo do cliente");
                    this.client.V();
                }
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private Barbearia() {
        this.client = new Semaforo(5);
        this.barber = new Semaforo(0);

        new Barbeiro(this).start();
        new Cliente(this).start();
    }

    public static void main(String[] args) {

        Barbearia barberShop = new Barbearia();
    }
}

/*


CONSOLE


Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Cortando o cabelo do cliente
Tirar cochilo, sem cliente
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...
Não tem lugar, volto outra hora...


 * */