public class Client implements Runnable {
    private String name;
    private BarberShop shop;

    public Client(BarberShop shop) {
        this.shop = shop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.valueOf(getName());
    }

    @Override
    public void run() {
        vaiCortarCabelo();

    }

    private synchronized void vaiCortarCabelo() {
        shop.clientArrived(this);
    }
}
