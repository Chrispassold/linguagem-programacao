import java.util.LinkedList;

public class BarberShop {

    private final int chairs;
    private final LinkedList<Client> clientList;

    BarberShop(int chairs) {
        this.chairs = chairs;
        this.clientList = new LinkedList<>();
    }

    void cortarCabelo() {
        Client client;
        synchronized (clientList) {
            while (clientList.size() == 0) {
                System.out.println("Barbeiro dormindo");
                try {
                    clientList.wait();
                } catch (InterruptedException iex) {
                    iex.printStackTrace();
                }
            }
            client = clientList.poll();
            System.out.println("Barbeiro foi acordado pelo " + client);
        }

        try {
            System.out.println("Barbeiro está cortando cabelo do " + client);
            Thread.sleep(2000);
        } catch (InterruptedException iex) {
            iex.printStackTrace();
        }

        System.out.println("Barbeiro terminou de cortar o cabelo do " + client);
    }

    void clientArrived(Client client) {
        synchronized (clientList) {
            if (clientList.size() == chairs) {
                System.out.println("Cliente foi embora, não tinha cadeira");
                return;
            }

            clientList.offer(client);

            if (clientList.size() == 1) {
                clientList.notify();
            }
        }
    }

}
