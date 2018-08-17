public class Exercicio3Thread {
     private static int a = 0;

    public static void main(String[] args){
        somar();
        subtrair();
    }

    private static void somar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (a != 100){
                    a++;
                    System.out.println("Soma: " + a);
                }
            }
        }).start();
    }

    private static void subtrair(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (a != 100){
                    a--;
                    System.out.println("Subtrai: " + a);
                }
            }
        }).start();
    }

}
