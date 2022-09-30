import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin yari capini giriniz.");
double yaricap = scanner.nextDouble();
        System.out.println("Merkez aci olcusunu giriniz.");
double alfa = scanner.nextDouble();
        System.out.println("girdiginiz degerlere gore daire diliminin alani = " + (pi*(yaricap*yaricap)*alfa)/360);

    }
}