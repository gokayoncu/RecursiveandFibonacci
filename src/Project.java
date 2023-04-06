import java.util.Scanner;

public class Project {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number :");
        num= input.nextInt();
        System.out.println(fib(num));
    }
}
