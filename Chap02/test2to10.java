import java.util.Scanner;

class test2to10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("姓:");
        String x = stdIn.next();
        System.out.print("名:");
        String m = stdIn.next();

        System.out.println("你好" + x + m + "先生。");
    }
}