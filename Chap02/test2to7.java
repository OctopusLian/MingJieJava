import java.util.Random;

class test2to7 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lucky1 = rand.nextInt(10); // 随机数1~9
        System.out.println("lucky1:" + lucky1);

        int lucky2 = rand.nextInt(10); // 随机数-1~-9
        System.out.println("lucky2:" + lucky2 * (-1));

        int lucky3 = rand.nextInt(110);
        lucky3 = lucky3 - 10; // 随机数10~99
        System.out.println("lucky3:" + lucky3);

    }
}