import java.util.concurrent.TimeUnit;

public class SleppingBarber {
    public static void main(String[] args) {

        BarberShop shop = new BarberShop(3);

        Barber barber = new Barber(shop);
        new Thread(barber).start();
        while (true) {
            Client client = new Client(shop);
            Thread threadClient = new Thread(client);
            client.setName("Client Thread " + threadClient.getId());
            threadClient.start();

            try {
                TimeUnit.SECONDS.sleep((long) (Math.random() * 10));
            } catch (InterruptedException iex) {
                iex.printStackTrace();
            }
        }

    }
}
