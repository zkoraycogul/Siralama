import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numara sayisini giriniz : ");
        int n = input.nextInt();
        int [] numbers = new int[n];

        for(int i=1;i<=n;i++) {
            System.out.print(i + ". ELeman = ");
            int x = input.nextInt();
            numbers[i-1] = x;
        }
        Arrays.sort(numbers);
        System.out.println("Siralama : " + (Arrays.toString(numbers)));
    }
}
