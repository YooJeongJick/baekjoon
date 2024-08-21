import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        String[] numbers = new String[2];
        int number1, number2, total;

        number = sc.nextLine();
        numbers = number.split(" ");
        number1 = Integer.parseInt(numbers[0]);
        number2 = Integer.parseInt(numbers[1]);
        total = number1 + number2;

        System.out.println(total);
    }
}