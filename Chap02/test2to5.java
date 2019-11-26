import java.util.Scanner;

class test2to5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("x的值");
        double x = stdIn.nextDouble();

        System.out.print("y的值");
        double y = stdIn.nextDouble();

        double sum = x + y;
        double ping = (x + y) / 2;
        System.out.println("合计值是" + sum);
        System.out.println("平均值是" + ping);
    }
}