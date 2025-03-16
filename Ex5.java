import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                System.out.print((n / 2 - i + 1) + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
