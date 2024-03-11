package weightedAverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        Double x = sc.nextDouble();
        Double y = sc.nextDouble();
        Double z = sc.nextDouble();

        Double media = (x * 4 + y * 4 + z * 2) / 10;
        System.out.printf("%.2f", media);
        sc.close();
    }
}
