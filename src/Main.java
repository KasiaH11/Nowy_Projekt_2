import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj pierwsza cyfre");
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        System.out.println("Podaj druga cyfre");
        int number2=scanner.nextInt();
        System.out.println("Podaj trzecia cyfre");
        int number3=scanner.nextInt();
        System.out.println("Suma" +(number1+number2+number3));
    }
}
