import java.util.Scanner;

public class shreya_05_takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextByte();
        int sum = a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}
