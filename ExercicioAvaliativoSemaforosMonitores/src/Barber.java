public class Barber implements Runnable {
    private BarberShop shop;

    public Barber(BarberShop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        while(true)
        {
            shop.cortarCabelo();
        }
    }
}
