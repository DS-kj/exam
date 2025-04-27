import java.util.Scanner;

public class coding2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
        int p = 1;
    while (n != 0) {
            int d = n % 10;
            p=p*d;
            n/=10;
    }
    System.out.println(p);
        scanner.close();
}
}