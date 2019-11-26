import java.util.Scanner;

class test2to4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int a = stdIn.nextInt(); // 读入a的整数值
        int b = a + 10;
        int c = a - 10;
        System.out.println("加上10后的值是" + b);
        System.out.println("减去10后的值是" + c);
    }
}