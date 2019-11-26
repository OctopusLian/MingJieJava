import java.util.Scanner;

class test2to6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("求三角形的面积");
        System.out.print("底：");
        double x = stdIn.nextDouble();

        System.out.print("高：");
        double y = stdIn.nextDouble();

        double mianji = x * y / 2;
        System.out.println("面积是" + mianji);
    }
}