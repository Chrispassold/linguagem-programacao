public class Exercicio2Thread {
     private static int a = 0;
     private static int b = 100;

    public static void main(String[] args){
        incrementa();
        decrementa();
    }

    private static void incrementa(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (a != 100 && b != 0){
                    a++;
                    System.out.println("incrementa: " + a);
                }
            }
        }).start();
    }

    private static void decrementa(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (a != 100 && b != 0){
                    b--;
                    System.out.println("decrementa: " + b);
                }
            }
        }).start();
    }

}
