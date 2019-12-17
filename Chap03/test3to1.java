import java.util.Scanner;

class test3to1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值:");
        int n = stdIn.nextInt();

        if (n < 0)
            n = n * (-1);
        System.out.println("其绝对值是" + n);
    }
}