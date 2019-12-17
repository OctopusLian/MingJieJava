import java.util.Random;
import java.util.Scanner;

class test2to8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int a = stdIn.nextInt(); // 读入a的整数值

        Random rand = new Random();
        int lucky1 = rand.nextInt(5); // 随机数1~9
        int c = lucky1 + a;

        System.out.println("生成了该值±5范围内的随机数，是" + c);
    }
}

/*
 * 整数值：100. 生成了该值±5范围内的随机数，是101
 */
