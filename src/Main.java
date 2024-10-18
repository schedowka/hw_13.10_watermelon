import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minWight = Integer.MAX_VALUE;
        int maxWight = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++) {
            int weight = scanner.nextInt();
            if (weight<minWight) {
                minWight = weight;
            }
            if (weight>maxWight) {
                maxWight = weight;
            }

        }
        System.out.println(minWight + " " + maxWight);
    }
}