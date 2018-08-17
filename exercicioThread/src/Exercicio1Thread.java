public class Exercicio1Thread {
     private static int a = 0;
     private static int b = 0;

    public static void main(String[] args){
        incrementaA();
        incrementaB();
    }

    private static void incrementaA(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (a != 100 && b != 100){
                    a++;
                    System.out.println("incrementa A: " + a);
                }
            }
        }).start();
    }

    private static void incrementaB(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (a != 100 && b != 100){
                    b++;
                    System.out.println("incrementa B: " + b);
                }
            }
        }).start();
    }

}
