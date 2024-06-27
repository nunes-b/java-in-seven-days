import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] numbers = {1, 2, 3, 4, 5};

        for (int index = 0; index < numbers.length; index++) {
            if(number <= 0){
                System.out.println("Seu numero é " + 0);
                break;
            }
            if (number == numbers[index]) {
                System.out.println("Seu numero contem " + number + " digitos.");
                break;
            }
        }
        if (number > 5) {
            System.out.println("O seu numero tem mais que 5 digitos.");
        }

    }
}
