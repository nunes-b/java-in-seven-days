import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Seja bem vindo a sua calculadora! \n Digite o primeiro valor que deseja realizar a soma: ");
        Scanner numero1 = new Scanner(System.in);
        float primeiroNumero = numero1.nextFloat();
        Scanner numero2 = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        float segundoNumero = numero2.nextFloat();
        float soma = primeiroNumero + segundoNumero;
        System.out.println("O resultado da soma é : " + soma);
    }
}