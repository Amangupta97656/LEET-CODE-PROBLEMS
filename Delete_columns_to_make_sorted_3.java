import java.util.Scanner;

public class FirstSetBitPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(-1);
            return;
        }

        int position = 1;

        while ((n & 1) == 0) {
            n = n >> 1;
            position++;
        }

        System.out.println(position);
    }
}
